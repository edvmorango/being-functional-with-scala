**Being functional with Scala**

**Introduction**

This course intends to be a useful asset to programmers in the functional programming universe, the main goals are guide
the paradigm shifting process, explore functional programming patterns and evangelize the paradigm benefits 
in software engineering.

**Environment**

  1 - Install the JDK 8 
 
  - Windows             
                                   
        http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  
  - mac OS  
  
        brew cask install java8
 
  - Linux 
    
        sudo apt-get install oracle-java8-installer
          
  2 - Install SBT  
  
   - Windows             
                                    
         https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Windows.html   
   
   - mac OS  
   
         brew install sbt@1
  
   - Linux 
     
         echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
         sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
         sudo apt-get update
         sudo apt-get install sbt

 
  3 - Setup IDE/Text editor
      
   *  https://www.jetbrains.com/idea/ (Recommended)
   *  http://ensime.github.io/ (vim/Emacs users)         
    
  
**Getting Started**
  
  After setup the environment, you should clone this repository. Open the terminal and go
  to the root directory of project(or just use the IDEA embedded terminal).
  
  * To run all tests
  
        sbt test
  
  * To run just a test suite
  
        testOnly *MySuite       
  
        

**written by Eduardo Morango for the community**