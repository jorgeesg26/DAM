static string IsPair(string input)
{
    int validInt = int.Parse(input);
    string esPar = Pair(validInt);
    return esPar;
    string Pair(int dataValue)
    {
        if (dataValue % 2 == 0)
        {
            return "Es Par";
        }
        else
        {
            return "Es Impar";
        }
    }
}