//Assignment 3 - Polymorphism and Interfaces
//CSIS 312-BO3

//Employee subclass PieceWorker
public class PieceWorker extends Employee {
    //define private instance variables wage & pieces
    private double wage;   // wage per piece
    private double pieces; //number of pieces produced

    //five-argument constructor
    public PieceWorker
    (String firstName, String lastName, String socialSecurityNumber, double wage, double pieces)
    //pull from superclass
    {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");

        //create wage & pieces objects
        this.wage = wage;
        this.pieces = pieces;
    }

    // set wage
    public void setWage(double wage)
    {
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");

        this.wage = wage;
    }

    // return wage
    public double getWage()
    {
        return wage;
    }

    //set pieces
    public void setPieces(double pieces)
    {
        this.pieces = pieces;
    }

    //return pieces
    public double getPieces()
    {
        return pieces;
    }

    // calculate earnings; override abstract method earnings in Employee, multiplies number of pieces produced by the wage per piece.
    @Override
    public double earnings()
    {
            return getWage() * getPieces();
    }

    // return String representation of PieceWorker object
    @Override
    public String toString()
    {
        return String.format("piece worker employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "wage per piece", getWage(),
                "pieces produced", getPieces());
    }
} //end class
