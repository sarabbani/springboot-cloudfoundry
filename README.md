# springboot-cloudfoundry

##prerequisite
Make sure you have created a trial account in cloudfoundry @ https://account.run.pivotal.io/sign-up

##How to Build & Deploy to Cloudfoundry

The following plugin has been used to push the artifact to cloud foundry and use the below values as reference.
<plugin>
				<groupId>org.cloudfoundry</groupId>
				<artifactId>cf-maven-plugin</artifactId>
				<version>1.1.4.BUILD-SNAPSHOT</version>
				<configuration>
					<target>http://api.run.pivotal.io</target>
					<org>lmn.om.test</org>
					<space>development</space>
					<appname>springcfdemo</appname>
					<url>springcfdemo.cfapps.io</url>
					<buildpack>java_buildpack</buildpack>
					<memory>512</memory>
					<instances>1</instances>
					<server>cloud-foundry-credentials</server>
				</configuration>
			</plugin>
      
 All the above values are directly mapped with your pivotol account except the entry "server" which indicates your pivotal account credentials. We need to add the following entry in settings.xml for the credentials integration to work properly.
 
 <servers>
 <server>
            <id>cloud-foundry-credentials</id>
            <username>{your username}</username>
            <password>{Your password}</password>
        </server>
</servers>


Just run the command "mvn clean install cf:push" to build the artifact and push to cloud foundry account.
