DataInputStream input = new DataInputStream (new BufferedInputStream(new FileInputStream("myData.dat")));
DataOutputStream output = new DataOutputStream (new BufferedOutputStream(new FileOutputStream("myData.dat")));

String filnamn = "minfil.txt";
FileWriter fw = new FileWriter(filnamn);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter utFil = new PrintWriter(bw);
FileReader fr = new FileReader(filnamn);
BufferedReader inFil = new BufferedReader(fr);

int x;
Random r = new Random();

for (int i = 0 ; i < 1920*1080 ; i++) {
x = r.nextInt(0xffffff);

Innehållet i textfilen ska vara 2 073 600 heltal (lika många som anatlet pixlar i 
1920x1080), slumpvis mellan 0 och 16777215 (0xffffff). Enklast genereras det med ett eget program