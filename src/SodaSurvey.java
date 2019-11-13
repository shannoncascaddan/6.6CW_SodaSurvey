import java.text.DecimalFormat;
public class SodaSurvey
{
    public static void main(String[] args)
    {
        int [][] scores = {{3, 4, 5, 2, 1, 4, 3, 2, 4, 4},
                           {2, 4, 3, 4, 3, 3, 2, 1, 2, 2},
                           {3, 5, 4, 5, 5, 3, 2, 5, 5, 5},
                           {1, 1, 1, 3, 1, 2, 1, 3, 2, 4}};
        final int SODAS = scores.length;
        final int PEOPLE = scores[0].length;
        int[] sodaSum = new int[SODAS];
        int[] personSum = new int[PEOPLE];
        for(int soda = 0; soda < SODAS; soda++)
        {
            for(int person = 0; person < PEOPLE;person++)
            {
                sodaSum[soda] += scores[soda][person];
                personSum[person] += scores[soda][person];
            }//end person for loop
        }//soda for loop
        DecimalFormat fmt = new DecimalFormat ("0.#");
        System.out.println("Averages:\n");
        for(int soda=0; soda<SODAS; soda++)
        {
            System.out.println("Soda #" +(soda+1)+": "+
                    fmt.format((double)sodaSum[soda]/PEOPLE));
        }//end 2nd soda for loop
        System.out.println();
        for(int people=0; people<PEOPLE; people++)
        {
            System.out.println("Person #" +(people+1)+": "+
                    fmt.format((double)personSum[people]/SODAS));
        }//end 2nd people for loop
    }//end main method
}//end SodaSurvey Class
