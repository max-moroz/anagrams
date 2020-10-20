# Anagram (Tasks 1-3) 
## Table of content  
* [Task](#Task)
* [How to build](#How-to-build)
* [File Structure](#File-structure)
* [Dependencies](#Dependencies)
* [Technologies](#Technologies)
* [Information and links](#Information-and-links)
* [Tests coverage report](#Tests-coverage-report)

## Task  
Write an application that reverses all the words of input text:
>
>  E.g. "abcd efgh" => "dcba hgfe"

All non-letter symbols should stay on the same places:
>
>  E.g. "a1bcd efg!h" => "d1cba hgf!e"

Use Latin alphabet for test only.

Write JUnit tests for the previous application. JUnit 5 should be used.

Convert your project to maven project.

## How to build:  
Make sure that Java Development Kit (JDK) and Maven tool are installed on your machine.

There are two options how to build project:

* Windows:
   
   - double-click on `make.bat`:
  
![Win make image](docs/img/win-make.png)
  
   - or use Command Prompt:  navigate to project's root folder and type `make.bat` command:

![Win make Command Prompt image](docs/img/win-cmd-make.png)
      
   - or use `mvnw.cmd package` command in Terminal (Maven Wrapper)
   
   - or use `mvn package` command in Terminal (Maven)
      
* Linux/MacOS:

   - execute `make.sh` script file by using `./make.sh` command:
      
![Linux build image](docs/img/lin-make.png)
      
![MacOS build image](docs/img/mac-make.png)
   
   - or use `./mvnw package` command in Terminal (Maven Wrapper)
   
   - or use `mvn package` command in Terminal with Maven


## File structure 
 ```bash
├── src
│   ├── main
│   │   └── java
│   │       └── ua/com/foxminded
│   │           ├── TextReverser.java
│   │           └── Main.java
│   └── test
│       └── java
│           └── ua/com/foxminded
│               ├── TextReverserTest.java
│               └── MainTest.java
├── dist
│   ├── AnagramOS.bat
│   ├── AnagramOS.sh
│   ├── AnagramOS.jar
│   └── README.md
├── docs
│   └── img
│       ├── *.png
├ ─ (target-tmp)
├── .gitignore
├── make.bat
├── make.sh
└── README.md

```

## Dependencies: 
 - JUnit Platform: junit-platform-console-standalone-1.6.0 ([download](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone/1.6.0))
- JUnit TestEngine API: junit-jupiter-api-5.6.0 ([download](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.6.0))
- Mockito mocking framework for unit tests: mockito-all-1.10.19 ([download](https://mvnrepository.com/artifact/org.mockito/mockito-all/1.10.19))
- JaCoCo - Java Code Coverage Library 0.8.5 ([download](https://mvnrepository.com/artifact/org.jacoco/jacoco-maven-plugin/0.8.5))
- Maven Wrapper ([download](https://mvnrepository.com/artifact/io.takari/maven-wrapper))

## Technologies  Project is created with:
* Java EE 1.8
* Junit 5
* Maven

## Information and links 
 - Java SE Runtime Environment 8 (JRE) ([download](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html))
- Apache Maven ([download](https://maven.apache.org/download.cgi))
- Eclipse ([download](https://www.eclipse.org/downloads/))

## Tests coverage report
  ![Test coverage](docs/img/test-coverage.png)