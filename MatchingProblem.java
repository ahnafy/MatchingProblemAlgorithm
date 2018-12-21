import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MatchingProblem {

    static boolean isStable(HashMap<Character,Character> pairs, HashMap<Character, char[]> progTable, HashMap<Character, char[]> compTable) {
        Set<Character> companies = compTable.keySet();
        Set<Character> programmers = progTable.keySet();
        for (char c : companies) {
            char [] list = compTable.get(c);

            for (char p : list) {
                if(c == pairs.get(p)) {
                    break;
                }
                
                if(prefers(p,c,progTable.get(p), pairs)) {
                    return false;
                }
            }
        }

            return true;
    }

    static HashMap<Character, char[]> buildTable(HashMap<Character, char[]> table, Scanner sc, int N) {
        for(int i = 0; i < N; i++) {
            char name = sc.next().charAt(0);
            char[] list = new char[N];

            for(int j = 0; j < N; j++) {
                list[j] = sc.next().charAt(0);
            }

            table.put(name,list);
        }

        return table;
    }

    static boolean prefers(char programmer, char company, char[] list, HashMap<Character,Character> pairs) {
        
        // Call current programmer and company match
        
        char current = pairs.get(programmer);
        
        // Decide based on which company is found first
        
        for (char c : list) {
            if (c == current) {
                return false;
            }
            if (c == company) {
                return true;
            }
        }

        // should not reach here
        return false;
    }

    /
    
    ** INPUT
     * First line: N, number of programmers/company pairs to make
     * next N lines: first character is the name of the company, followed by their list of preferences.
     * next N lines: first character is the name of the programmer, followed by their list of preferences.
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        HashMap<Character, char[]> progTable = new HashMap<>();
        HashMap<Character, char[]> compTable = new HashMap<>();

        compTable = buildTable(compTable,sc,N);
        progTable = buildTable(progTable,sc,N);

        Set<Character> companies = compTable.keySet();

        HashMap<Character, Character> pairs = new HashMap<>();

        int numMatches = 0;
       
        while(numMatches != N) {
            for (char c : companies) {
                // skip this company if it has a pair already
                if(pairs.containsValue(c)) {
                    continue;
                }
                char[] list = compTable.get(c);
  
                    for (char p : list) {
                    // if this choice dont have a pair, we have a match.
                    if(pairs.get(p) == null) {
                        pairs.put(p,c);
                        numMatches++;
                        break;
                    }
                    // if this choice prefers this company, make new match
                    else if(prefers(p,c,progTable.get(p),pairs)) {
                        pairs.remove(p);
                        pairs.put(p,c);
                        break;
                    }
                }
            }
        }

        // print out the pairs
        pairs.forEach((k,v) -> System.out.println(k + " is matched with " + v));
        System.out.println("Stable? " + isStable(pairs,progTable,compTable));

    }
}
