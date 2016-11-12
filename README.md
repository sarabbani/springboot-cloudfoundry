# springboot-cloudfoundry

##prerequisite
Make sure you have created a trial account in cloudfoundry @ https://account.run.pivotal.io/sign-up

##How to Build & Deploy to Cloudfoundry
The **cf-maven-plugin** has been used to push the artifact into cloud foundry and all the values configured inside this plugin are directly mapped with cloud foundary account configuration except the **server** which indicate the credentials used to login into your cloud foundry account

This **server** entry needs to be configured in your settings.xml as per this documentation https://docs.run.pivotal.io/buildpacks/java/build-tool-int.html

Just run the command **mvn clean install cf:push** to build the artifact and push to cloud foundry account.
