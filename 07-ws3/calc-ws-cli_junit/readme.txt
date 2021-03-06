This is a Java Web Service client with JUnit tests

The client uses the wsimport tool
to generate classes that can invoke the web service and
perform the Java to XML data conversion.

The client needs access to the WSDL file,
either using HTTP or using the local file system.


Instructions using Maven:
------------------------

You must start calc-ws first.

The default WSDL file location is ${basedir}/../calc-ws_wsdl/src/main/resources,
i.e. the WSDL is retrieved from the server sources,
assuming they are next to the client project.

The WSDL could be copied to the client project and
stored at ${basedir}/src/main/resources .

The WSDL location is specified in pom.xml
/project/build/plugins/plugin[artifactId="jaxws-maven-plugin"]/configuration/

The jaxws-maven-plugin is run at the "generate-sources" Maven phase
(which happens before the compile phase).

To generate stubs using wsimport:
  mvn generate-sources

To compile:
  mvn compile

To test:
  mvn test

To run using exec plugin:
  mvn exec:java

To generate launch scripts for Windows and Linux:
  mvn package appassembler:assemble

To run using appassembler plugin:
  On Windows:
    target\appassembler\bin\calc-ws-cli.bat http://localhost:8080/calc-ws/endpoint
  On Linux:
    ./target/appassembler/bin/calc-ws-cli http://localhost:8080/calc-ws/endpoint


To configure the project in Eclipse:
-----------------------------------

If Eclipse files (.project, .classpath) exist:
    'File', 'Import...', 'General'-'Existing Projects into Workspace'
    'Select root directory' and 'Browse' to the project base folder.
    Check if everything is OK and 'Finish'.

If Eclipse files do not exist:
    'File', 'Import...', 'Maven'-'Existing Maven Projects'.
    'Browse' to the project base folder.
    Check that the desired POM is selected and 'Finish'.

To run:
    Select the main class and click 'Run' (the green play button).
    Specify arguments using 'Run Configurations'


--
Revision date: 2015-04-08
leic-sod@disciplinas.tecnico.ulisboa.pt
