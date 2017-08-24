

public class Libro
{
    private String titulo;
    private String autor;
    
    public Libro(String tituloI, String autorI)
    {
        titulo=tituloI;
        autor=autorI;
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    
    
}
