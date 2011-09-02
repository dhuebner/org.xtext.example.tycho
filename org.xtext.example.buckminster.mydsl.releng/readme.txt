### Using buckminster headless ####

Download latest director application from
http://www.eclipse.org/downloads/download.php?file=/tools/buckminster/products/director_latest.zip
Unzip it somewhere. Switch to console, go to the director directory.
Run:
./director -r http://download.eclipse.org/tools/buckminster/headless-3.7/ -d ~/buckminster -p Buckminster -i org.eclipse.buckminster.cmdline.product

Buckminster headless will be installed.

Go to ~/buckminster
Run: 
./buckminster install http://download.eclipse.org/tools/buckminster/headless-3.7/ org.eclipse.buckminster.core.headless.feature
./buckminster install http://download.eclipse.org/tools/buckminster/headless-3.7/ org.eclipse.buckminster.pde.headless.feature
	to install core components.

Now you can start your build:
local
	make sure "Build with buckminster.launch" points to the right buckminster location
	run configuration in eclipse: right click the file choose "Build with buckminster" 

build server
./buckminster -S <projects-root>/org.xtext.example.buckminster.mydsl.releng/releng/commands.txt -vmargs -Dworkspace.root=<projects-root>
bash /Users/huebner/buckminster/buckminster -S /Users/huebner/Downloads/eclipse3.7/org.xtext.example.tycho/org.xtext.example.buckminster.mydsl.releng/releng/commands.txt -vmargs -Dworkspace.root=/Users/huebner/Downloads/eclipse3.7/org.xtext.example.tycho/
