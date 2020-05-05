# spring-boot-kubernetes
Demo project for Spring Boot, dekorate and kubernetes integration

`
mvn clean install
cd company
docker build --tag infogen/company .
cd ../department
docker build --tag infogen/department .
cd employee
docker build --tag infogen/employee .
`

To start the kubernetes deployment:
`
kubectl create --filename company/target/classes/META-INF/dekorate/kubernetes.yml
kubectl create --filename department/target/classes/META-INF/dekorate/kubernetes.yml
kubectl create --filename employee/target/classes/META-INF/dekorate/kubernetes.yml
`

To redeploy the new docker file: (but it will not call the kubernetes.yml file). You will need to delete the existing deployment to create a new one.
`
kubectl patch deployment company -p "{\"spec\": {\"template\": {\"metadata\": { \"labels\": {  \"redeploy\": \"$(date +%s)\"}}}}}"
kubectl patch deployment department -p "{\"spec\": {\"template\": {\"metadata\": { \"labels\": {  \"redeploy\": \"$(date +%s)\"}}}}}"
kubectl patch deployment employee -p "{\"spec\": {\"template\": {\"metadata\": { \"labels\": {  \"redeploy\": \"$(date +%s)\"}}}}}"
`

Use `k9s` to view the kube 
