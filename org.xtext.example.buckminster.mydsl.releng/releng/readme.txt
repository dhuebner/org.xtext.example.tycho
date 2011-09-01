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

Now you can start build:
./buckminster -L DEBUG -consoleLog -S <eclipse-workspace>/org.xtext.example.buckminster.mydsl.releng/releng/commands.txt -vmargs -Dworkspace.root=<eclipse-workspace>
./buckminster -L DEBUG -data ../ws -S /Users/huebner/Downloads/eclipse3.7/org.xtext.example.tycho/org.xtext.example.buckminster.mydsl.releng/releng/commands.txt -vmargs -Dworkspace.root=/Users/huebner/Downloads/eclipse3.7/org.xtext.example.tycho