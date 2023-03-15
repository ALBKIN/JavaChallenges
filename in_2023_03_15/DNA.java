// LEARN JAVA / STRING METHODS / DNA Sequencing

/*
 This program will be trying to determine whether there is a protein in a strand of DNA. Yay!
 Check out those awesome DNA ascii drawings:
  -. .-.   .-. .-.   .
    \   \ /   \   \ /
   / \   \   / \   \
  ~   `-~ `-`   `-~ `-

`-:-.   ,-;"`-:-.   ,-;"`-:-.   ,-;"`-:-.   ,-;"
   `=`,'=/     `=`,'=/     `=`,'=/     `=`,'=/
     y==/        y==/        y==/        y==/
   ,=,-<=`.    ,=,-<=`.    ,=,-<=`.    ,=,-<=`.
,-'-'   `-=_,-'-'   `-=_,-'-'   `-=_,-'-'   `-=_

*/

package in_2023_03_15;


public class DNA {

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGAA";

        String dna = dna3;
        // find length of a whole DNA (needs to be divisible by 3, but that will be checked later)
        int length = dna.length();
        System.out.println("Length of DNA strand is: " + length);

        // find START CODON (protein must start with: ATG)
        int start = dna.indexOf("ATG");
        System.out.println("Start Codon begins at: " + start);

        // check if there's a STOP CODON (protein must end with: TGA)
        int stop = dna.indexOf("TGA");
        System.out.println("Stop Codon begins at: " + stop);

        if (start >= 0 && stop >= 0) {
            System.out.println("Condition 1 and 2 are satisfied. Checking for divisibility...");
        }
        if ((stop - start) % 3 == 0) {
            System.out.println("All conditions met. Protein found. Hura.");
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("Nope ;( not a protein...");
        }

        /*
                 ______
              (((((    \
               ); \\\\|)|
              <   ||||||/
               >  ///////
               `--| abac
               ___/     \___
            (    ~        ~   )
            \  `              /
            | \             / |
            | -\           /  /
            (__ |     |   |- ,
                |     |   |
                /          \
               /     `,     \
              |       )      )
              |      _/_   _ /
               \      |      |
                |     |      ,

*/

    }
}