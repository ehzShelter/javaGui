import java.io.*;

public class Ipc{

    public static void main(String[] args) throws IOException{

        String programFileName = "pandoc";

        String ExecLoc = System.getProperty("user.dir") + "/" + programFileName;
        File f = new File(ExecLoc);

                if(!f.exists() || f.isDirectory()) {
                    System.out.println("Winduch");
                    ExecLoc = programFileName + ".exe";
                    }
                else {
                    System.out.println("Assuming Linux");
                    }

        String[] commands = {ExecLoc,"test.html","-o","test.md"};

        ProcessBuilder pb = new ProcessBuilder().command(commands).redirectErrorStream(true);

        Process proc = pb.start();

        BufferedReader stdInput = new BufferedReader(new
             InputStreamReader(proc.getInputStream()));

        BufferedReader stdError = new BufferedReader(new
             InputStreamReader(proc.getErrorStream()));

        // read the output from the command
        System.out.println("Here is the standard output of the command:\n");
        String s = null;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }

        // read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }

    }

}
