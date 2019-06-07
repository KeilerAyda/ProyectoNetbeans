
import DAO.CategoriaDao;
import java.util.ArrayList;
import transferObject.Categoria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CategoriaDao catedao = new CategoriaDao();
       ArrayList<Categoria>lista = new ArrayList<>();
     //  Categoria cate = new Categoria ();
    //   cate.setIdCategoria(1);
     //  cate.setDescripcion("Metal");
       //cate.setEstado('B');
       
     //  catedao.insertarCategoria(cate);
       
       lista = catedao.listarCategorias();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("dato"+lista.get(i).getDescripcion());
           
            }
        catedao.eliminarCategoria(1);
          
        
    }
    
}
