C:\Users\PC>git --version
git version 2.51.0.windows.1

C:\Users\PC>cd "C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java"

C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java>git init
Initialized empty Git repository in C:/Users/PC/Documents/NetBeansProjects/CalculoDescuento.java/.git/

C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java>git add .
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/mycompany/calculodescuento/java/CalculoDescuentoJava.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst', LF will be replaced by CRLF the next time Git touches it

C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java>git commit -m "Calculo de descuento en Java"
[master (root-commit) f823aa3] Calculo de descuento en Java
 5 files changed, 64 insertions(+)
 create mode 100644 pom.xml
 create mode 100644 src/main/java/com/mycompany/calculodescuento/java/CalculoDescuentoJava.java
 create mode 100644 target/classes/com/mycompany/calculodescuento/java/CalculoDescuentoJava.class
 create mode 100644 target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst
 create mode 100644 target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst

C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java>git branch -M main

C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java>git remote add origin https://github.com/JeremyGuevara/CalculoDescuento.java.git

C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java>git push -u origin main
Enumerating objects: 24, done.
Counting objects: 100% (24/24), done.
Delta compression using up to 8 threads
Compressing objects: 100% (11/11), done.
Writing objects: 100% (24/24), 3.15 KiB | 403.00 KiB/s, done.
Total 24 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/JeremyGuevara/CalculoDescuento.java.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

C:\Users\PC\Documents\NetBeansProjects\CalculoDescuento.java>
