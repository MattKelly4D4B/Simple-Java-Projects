/**
  A tax return of a taxpayer in 1992.
*/

class TaxReturn
{
    /**
    Constructs a TaxReturn object for a given income and marital status.
    @param anIncome the taxpayer Income
    @param aStatus either SINGLE or MARRIED
    */

    public static final int SINGLE = 1;
    public static final int MARRIED = 2;

    public static final double RATE1 = 0.15;
    public static final double RATE2 = 0.15;
    public static final double RATE3 = 0.15;

    public static final double SINGLE_CUTOFF1 = 21450;
    public static final double SINGLE_CUTOFF2 = 51900;

    public static final double SINGLE_BASE2 = 3217.50;
    public static final double SINGLE_BASE3= 11743.50;
    public static final double MARRIED_CUTOFF1 = 35800;
    public static final double MARRIED_CUTOFF2 = 86500;

    public static final double MARRIED_BASE2 = 5370;
    public static final double MARRIED_BASE3 = 19566;

    private double income;
    private int status;

    public TaxReturn(double anIncome, int aStatus)
    {
      income = anIncome;
      status = aStatus;
    }

    public double getTax()
    {
        double tax = 0;

        if (status == SINGLE)
        {
          if (income <= SINGLE_CUTOFF1)
            tax = RATE1 * income;
          else if (income <= SINGLE_CUTOFF2)
            tax = SINGLE_BASE2 + RATE2 *(income - SINGLE_CUTOFF1);
          else
            tax = SINGLE_BASE3 + RATE3 * (income -SINGLE_CUTOFF2);

        }
            else
          {
            if (income <= MARRIED_CUTOFF1)
              tax = RATE1 * income;
            else if (income <= MARRIED_CUTOFF2)
              tax = MARRIED_BASE2 + RATE2 * (income - MARRIED_CUTOFF1);
            else
              tax = MARRIED_BASE3 + RATE3 * (income - MARRIED_CUTOFF2);
            }
            return tax;

        }

      }
