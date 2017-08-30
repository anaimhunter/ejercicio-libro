
/**
 * La clase Libro representa un objeto libro
 * @author Ana M.Hunter
 */
public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private int prestamos;
    
    /**
     * Constructor libro
     * @param tituloI  Parametro que representa el titulo del libro
     * @param autorI Parametro que representa el autor del libro
     * @param paginasI Parametro que representa el numero de paginas del libro
     */
    public Libro(String tituloI, String autorI, int paginasI)
    {
        titulo=tituloI;
        autor=autorI;
        paginas=paginasI;
        numeroDeReferencia = "";
        prestamos = 0;
    }
    /**
     * Da el nombre del autor
     * @return Regresa el nombre del autor
     */
    public String dimeAutor()
    {
        return autor;
    }
    
    /**
     * Da el titulo del libro
     * @return Regresa el titulo del libro
     */
    public String dimeTitulo()
    {
        return titulo;
    }
    
    /**
     * Da el numero de paginas
     * @return Regresa el numero de paginas
     */
    public int dimePaginas()
    {
        return paginas;
    }
    
    /**
     * Da los datos del libro
     * @return Regresa una cadena que contiene los datos del libro: titulo,autor,
     *         numero de paginas,numero de referencia, numero de prestamos, 
     */
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
        cadDet = cadDet +",";
        cadDet = cadDet + "Numero de Referencia:";
        if(numeroDeReferencia.length()!=0)
        {
           cadDet = cadDet + numeroDeReferencia; 
        }
        else
        {
            cadDet = cadDet + "ZZZ";
        }
        cadDet = cadDet +",";
        cadDet = cadDet + "Prestamos:";
        cadDet = cadDet + prestamos;
        cadDet = cadDet +".";
        
        return cadDet;
    }
    
    /**
     * Cambia el numero de referencia
     * @param nuevaRef Parametro que representa el nuevo nuemero de referencia
     */
    public void cambiaNumRef(String nuevaRef)
    {
        if(numeroDeReferencia.length()>2)
        {
            numeroDeReferencia = nuevaRef;
        }
    }
    
    /**
     * Da el numero de referencia
     * @return Regresa el numero de referencia
     */
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    /**
     * Presta un libro
     */
    public void prestar()
    {
        prestamos ++;
    }
    
    /**
     * Indica cuantas veces se ha prestado el libro
     * @return Regresa el numero de prestamos del libro
     */
    public int dimePrestamos()
    {
        return prestamos;
    }
    
}
