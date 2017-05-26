This is Java RMI implementation of the Tic Tac Toe game client.


Instructions using Maven:
------------------------

To compile and copy the properties file to the output directory:
  mvn compile

To generate launch scripts for Windows and Linux:
  (appassembler:assemble is attached to install phase)
  mvn install

To run:
  Using Maven exec plugin:
    mvn exec:java
  Using Maven appassembler plugin:
    On Windows:
      target\appassembler\bin\ttt-rmi-client
    On Linux:
      ./target/appassembler/bin/ttt-rmi-client


To configure the Maven project in Eclipse:
-----------------------------------------

'File', 'Import...', 'Maven'-'Existing Maven Projects'
'Select root directory' and 'Browse' to the project base folder.
Check that the desired POM is selected and 'Finish'.


--
Revision date: 2017-03-05
leic-sod@disciplinas.tecnico.ulisboa.pt
