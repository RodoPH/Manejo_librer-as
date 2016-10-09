
package operaciones;
import ARectangulo.ARectangulo;
import ACirculo.Circulo;
import Atriangulo.ATriangulo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Operaciones {

    public static void main(String[] args) {
        int respuesta;
        double diametro;
       Circulo ac = new Circulo();
       ATriangulo at = new ATriangulo();
       ARectangulo ar = new ARectangulo();
       String[] opciones = {"Radio", "Diametro"};
       String decide;
               
        double base, altura, radio;
        
       
            do {
                try {
                    respuesta = (Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Elige una opción: \n 1: Área de Triángulo Escaleno \n 2: Área de un círculo \n 3 : Área de rectángulo \n 4: Salir",
                            "Menú de calculos", 3)));
                    
				switch (respuesta) {
                                    case 1:
                                        base = Double.parseDouble(JOptionPane.showInputDialog(null,"Escribe el valor de la base del triángulo","Datos",JOptionPane.QUESTION_MESSAGE));
                                       altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Escribe el valor de la altura del triángulo","Datos",JOptionPane.QUESTION_MESSAGE));
                                        
                                        at.AreaTriangulo(base, altura);
                                        break;

				case 2:
                                decide = (String) JOptionPane.showInputDialog(null, "Qué valor desea ingresar","Decide",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
                                   
                                if(decide.equals(opciones[0])){
                                        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Escribe el valor del radio del círculo"));
					ac.areaCirculo(radio);
                                }else{
                                    diametro = Double.parseDouble(JOptionPane.showInputDialog(null,"Escribe el valor del diametro del círculo"));
                                    
                                    ac.areaCirculo(diametro/2);
                                }
					break;

				case 3:
                                       base = Double.parseDouble(JOptionPane.showInputDialog(null,"Escribe el valor de la base del triángulo","Datos",JOptionPane.QUESTION_MESSAGE));
                                       altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Escribe el valor de la altura del triángulo","Datos",JOptionPane.QUESTION_MESSAGE));
                                        
                                        ar.AreaRectangulo(base, altura);
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null,"Saliendo...");
                                    System.exit(0);
                                    break;

				default:
					JOptionPane.showMessageDialog(null, "Esa opción no está disponible");
					break;
				}
			} catch (HeadlessException | NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "ERROR---> " + e.getMessage());
				respuesta = 0;
			}
		} while (respuesta != 4);

	}
    }
    

