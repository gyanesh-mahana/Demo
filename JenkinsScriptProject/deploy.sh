#
#	Deploy the war file to tomcat9
#

mvn deploy -DaltDeploymentRepository=script-repo::default::https://tomcat:tomcat@localhost:8081
