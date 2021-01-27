#
#	Deploy the war file to tomcat9
#

curl -v -u tomcat:tomcat -T **/*.war 'http://localhost:8081/manager/text/deploy?path=/deplyed-using-script-jenkins&update=true'

#mvn deploy -DaltDeploymentRepository=script-repo::default::https://tomcat:tomcat@localhost:8081
#deploy adapters: [tomcat9(credentialsId: '6c41928c-4b3f-4672-ba81-43ccfe0d40e5', path: '', url: 'http://localhost:8081/')], contextPath: 'deployedfromscriptwebapp', war: '**/*.war'
