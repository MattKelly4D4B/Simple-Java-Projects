/**
  A class thgat describes the effects of an earthquake.
*/

public class Earthquake
{
    /**
      Constructs an Earthquake object
      @param magnitude the magnitude on the Richter scale

    */
    private double richter;
    public Earthquake(double magnitude)
    {
      richter = magnitude;
    }

    /**
      Gets a description of the effect of the earthquake.
      @return the description of the effects
    */

    public String getDescription()
    {
      String r;
      if (richter >= 8.0)
        r = "Most structures fall";
      else if (richter >= 7.0)
        r = "Many buildings destroyed";
      else if (richter >= 6.0)
        r = "Many buildings considerably damaged; " + "some collapse";
      else if (richter >= 4.5)
        r = "Damage to poorly constructed buildings";
      else if (richter >= 3.5)
        r = "Felt by many people, no destruction";
      else if (richter >= 0)
        r = "Generally not felt by people";
      else
        r = "negative numbers are not valid";
      return r;

    }
}
