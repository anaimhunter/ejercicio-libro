

public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String tituloI, String autorI, int paginasI)
    {
        titulo=tituloI;
        autor=autorI;
        paginas=paginasI;
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    
    public int dimePaginas()
    {
        return paginas;
    }
    
    public String dimeDetalles()
    {
        String cadDet = "";
        cadDet = cadDet +"Titulo:";
        cadDet = cadDet + titulo;
        cadDet = cadDet +",";
        cadDet = cadDet + "Autor:";
        cadDet = cadDet + autor;
        cadDet = cadDet +",";
        cadDet = cadDet + "Paginas:";
        cadDet = cadDet + paginas;
        cadDet = cadDet +".";
        return cadDet;
    }
}
