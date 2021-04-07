
class Sprawdzian
{
    public String data = " ";
    public int ocena;
    public String nazwa_przedmiotu = " ";

    @Override
    public String toString()
    {
        return "Data "+data+"\n"+
        "Ocena "+ocena+"\n"+
        "Przedmiot "+nazwa_przedmiotu;
    }
}