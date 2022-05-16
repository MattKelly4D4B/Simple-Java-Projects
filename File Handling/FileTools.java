import java.io.*;

class FileTools
{

// -----------------------------------------------
public static void copyFile(String inputFileName, String outputFileName) throws IOException
{
final int MAX_BYTES = 100;
BufferedInputStream inputFile;
BufferedOutputStream outputFile;
byte[] buffer = new byte[MAX_BYTES];;
int byteCount;

System.out.println();
System.out.println("Copying " + inputFileName + " to " + outputFileName + " ...");

inputFile = new BufferedInputStream(new FileInputStream(inputFileName) );
outputFile = new BufferedOutputStream(new FileOutputStream(outputFileName));

do
   {
   byteCount = inputFile.read(buffer, 0, MAX_BYTES);
   outputFile.write(buffer, 0, byteCount);
   }
while (byteCount == MAX_BYTES);

inputFile.close();
outputFile.flush();
outputFile.close();

System.out.println();
System.out.println("Done");
} // End copyFile


// -----------------------------------------------
public static void joinFile(String inputFileNameA, String inputFileNameB, String outputFileName) throws IOException
{

final int MAX_BYTES = 100;
BufferedInputStream inputFile1;
BufferedInputStream inputFile2;
BufferedOutputStream outputFile;
byte[] buffer = new byte[MAX_BYTES];
int byteCount;

System.out.println();
System.out.println("Copying " + inputFileNameA + "and " + inputFileNameB + " to " + outputFileName + " ...");

inputFile1 = new BufferedInputStream(new FileInputStream(inputFileNameA));
inputFile2 = new BufferedInputStream(new FileInputStream(inputFileNameB));

outputFile = new BufferedOutputStream(new FileOutputStream(outputFileName));

do
   {
   byteCount = inputFile1.read(buffer, 0, MAX_BYTES);
   
   outputFile.write(buffer, 0, byteCount);
   byteCount = inputFile2.read(buffer,0,MAX_BYTES);
   outputFile.write(buffer, 0, byteCount);
   }
while (byteCount == MAX_BYTES);

inputFile1.close();
inputFile2.close();
outputFile.flush();
outputFile.close();

System.out.println();
System.out.println("Done");


} // End joinFile


} // End class
