/* Implementación de clases encontradas en el libro escrito por Leonardo Bermón Angarita  */
package Parte2;

import java.awt.event.*;
import javax.swing.*; 

public class FigurasGeometricas
{
	public static void main(String[] args) {
		// Casos de prueba
	Circulo figura1 = new Circulo(2.0);
	Rectangulo figura2 = new Rectangulo(1.0,2.0);
	Cuadrado figura3 = new Cuadrado(3.0);
	TrianguloRectangulo figura4 = new TrianguloRectangulo(3.0,5.0);
	Rombo figura5 = new Rombo(1.0, 5.0, 6.0);
	Trapecio figura6 = new Trapecio(1.0, 2.0, 3.0, 4.0, 5.0);
	System.out.println("El área del círculo es = " + figura1.calcularArea());
	System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
	System.out.println();
	System.out.println("El área del rectángulo es = " + figura2.calcularArea());
	System.out.println("El perímetro del rectángulo es = " + figura2.
	calcularPerimetro());
	System.out.println();
	System.out.println("El área del cuadrado es = " + figura3.calcularArea());
	System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
	System.out.println();
	System.out.println("El área del triángulo es = " + figura4.calcularArea());
	System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
	figura4.calcularTipodeTriangulo();
	System.out.println("El perimetro del rombo es = " + figura5.calcularPerimetro());
	System.out.println("El area del rombo es = " + figura5.calcularArea());
	System.out.println("El perimetro del trapecio es = " + figura6.calcularPerimetro());
	System.out.println("El area del trapecio es = " + figura6.calcularArea());

	// Interfaz grafica
	Figures();
	}

	public static void Figures(){
        JFrame f = new JFrame("Figuras geometricas");

        JLabel l1 = new JLabel("Bienvenido a los ejercicios de Java en interfaz gráfica ");
        // JButton b1 = new JButton("correr");
        JButton b2 = new JButton("Figuras");
        // b1.setBounds(100,240,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(150,200, 500, 30);

        // f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setLocation(250,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        /* b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("testo");
            }
        }); */

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Circle();
            }
        });
    }

	public static void Circle(){
		JFrame f = new JFrame("Circulo");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, r1, r2;
        c1 = new JTextField("radio (Double)");

        r1 = new JTextField("Area");
        r2 = new JTextField("Perimetro");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(r1);
        f.add(r2);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Circulo clase = new Circulo(Double.parseDouble(c1.getText()));

            r1.setText("Area del circulo: " + clase.calcularArea());
            r2.setText("Perimetro del circulo : " + clase.calcularPerimetro());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Rectangle();
            }
        });
	}

	public static void Rectangle(){
        JFrame f = new JFrame("Rectangulo");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, r1, r2;
        c1 = new JTextField("Base (Double)");
        c2 = new JTextField("Altura (Double)");

        r1 = new JTextField("Area");
        r2 = new JTextField("Perimetro");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(r1);
        f.add(r2);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Rectangulo clase = new Rectangulo(Double.parseDouble(c1.getText()), 
                                                  Double.parseDouble(c2.getText()));

            r1.setText("Area del rectangulo : " + clase.calcularArea());
            r2.setText("Perimetro del rectangulo : " + clase.calcularPerimetro());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Cuadrado();
            }
        });
	}

	public static void Cuadrado(){
		JFrame f = new JFrame("Cuadrado");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, r1, r2;
        c1 = new JTextField("lado (Double)");

        r1 = new JTextField("Area");
        r2 = new JTextField("Perimetro");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(r1);
        f.add(r2);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Circulo clase = new Circulo(Double.parseDouble(c1.getText()));

            r1.setText("Area del cuadrado: " + clase.calcularArea());
            r2.setText("Perimetro del cuadrado : " + clase.calcularPerimetro());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                TriangleRectangle();
            }
        });
	}

	public static void TriangleRectangle(){
        JFrame f = new JFrame("Triangulo rectangulo");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, r1, r2, r3, r4;
        c1 = new JTextField("base (Double)");
        c2 = new JTextField("altura (Double)");

        r1 = new JTextField("Area");
        r2 = new JTextField("Perimetro");
        r3 = new JTextField("Hipotenusa");
        r4 = new JTextField("Tipo");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r3.setBounds(100, 270, 400, 30);
        r4.setBounds(100, 300, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);
        r3.setEditable(false);
        r4.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TrianguloRectangulo clase = new TrianguloRectangulo(Double.parseDouble(c1.getText()), 
                                                      				Double.parseDouble(c2.getText()));

            r1.setText("Area del triangulo: " + clase.calcularArea());
            r2.setText("Perimetro del triangulo: " + clase.calcularPerimetro());
            r3.setText("Hipotenusa: " + clase.calcularHipotenusa());
            r4.setText("Tipo de triangulo: " + clase.calcularTipodeTriangulo());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Rombus();
            }
        });
	}

	public static void Rombus(){
        JFrame f = new JFrame("Rombo");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, c3, r1, r2;
        c1 = new JTextField("lado (Double)");
        c2 = new JTextField("diagonal menor (Double)");
        c3 = new JTextField("diagonal mayor (Double)");

        r1 = new JTextField("Area");
        r2 = new JTextField("Perimetro");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);
        c3.setBounds(100, 90, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(r1);
        f.add(r2);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Rombo clase = new Rombo(Double.parseDouble(c1.getText()), 
                                        Double.parseDouble(c2.getText()), 
                                        Double.parseDouble(c3.getText()));

            r1.setText("Area del rombo: " + clase.calcularArea());
            r2.setText("Perimetro del rombo: " + clase.calcularPerimetro());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Trapezoid();
            }
        });
	}

	public static void Trapezoid(){
		JFrame f = new JFrame("Trapecio");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, c3, c4, c5, r1, r2;
        c1 = new JTextField("base menor (Double)");
        c2 = new JTextField("base mayor (Double)");
        c3 = new JTextField("lado 1 (Double)");
        c4 = new JTextField("lado 2 (Double)");
        c5 = new JTextField("altura (Double)");

        r1 = new JTextField("Area");
        r2 = new JTextField("Perimetro");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);
        c3.setBounds(100, 90, 400, 30);
        c4.setBounds(100, 120, 400, 30);
        c5.setBounds(100, 150, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(c5);
        f.add(r1);
        f.add(r2);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Trapecio clase = new Trapecio(Double.parseDouble(c1.getText()),
										  	  Double.parseDouble(c2.getText()), 
                                              Double.parseDouble(c3.getText()), 
                                              Double.parseDouble(c4.getText()), 
                                              Double.parseDouble(c5.getText()));

            r1.setText("Area: " + clase.calcularArea());
            r2.setText("Perimetro: " + clase.calcularPerimetro());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
            }
        });
	}
}

abstract class FiguraGeometrica {

	public abstract Double calcularArea();
	public abstract Double calcularPerimetro();
}

class Circulo extends FiguraGeometrica {
	Double radio;

	public Circulo(Double r){
		radio = r;
	}

	public Double calcularArea(){
		return (Math.PI * Math.pow(radio, 2));
	}

	public Double calcularPerimetro(){
		return (2*Math.PI*radio);
	}
}

class Rectangulo extends FiguraGeometrica {
	Double base;
	Double altura;

	public Rectangulo(double b, double h){
		base = b;
		altura = h;
	}

	public Double calcularArea(){
		return (base * altura);
	}

	public Double calcularPerimetro(){
		return (2*base + 2*altura);
	}
}

class Cuadrado extends FiguraGeometrica {
	Double lado;

	public Cuadrado(Double l){
		lado = l;
	}

	public Double calcularArea(){
		return (Math.pow(lado,2));
	}

	public Double calcularPerimetro(){
		return (4*lado);
	}
}

class TrianguloRectangulo extends FiguraGeometrica {
	Double base;
	Double altura;
	public TrianguloRectangulo(Double b, Double h){
		base = b;
		altura = h;
	}

	public Double calcularArea(){
		return (0.5*base*altura);
	}

	public Double calcularPerimetro(){
		return (base + altura + calcularHipotenusa());
	}

	public Double calcularHipotenusa(){
		return Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
	}

	public String calcularTipodeTriangulo(){
		String resultado = "";
		if ((base == altura) && (base == calcularHipotenusa())){
			resultado = "Equilatero";
		}

		else if ((base != altura) && (base != calcularHipotenusa())){
			resultado = "Escaleno";
		}

		else{
			resultado = "Isosceles";
		}

		return resultado;
	}
}

class Rombo extends FiguraGeometrica {
	Double lado;
	Double diagonalMenor;
	Double diagonalMayor;

		public Rombo(Double l, Double dMen, Double dMay){
		lado = l;
		diagonalMenor = dMen;
		diagonalMayor = dMay;
	}
	
	public Double calcularArea(){
		return ((diagonalMayor*diagonalMenor)/2);
	}

	public Double calcularPerimetro(){
		return (lado*4);
	}
}

class Trapecio extends FiguraGeometrica {
	Double baseMenor;
	Double baseMayor;
	Double lado1;
	Double lado2;
	Double altura;

	public Trapecio(Double bMen, Double bMay, Double l1, Double l2, Double h){
		baseMenor = bMen;
		baseMayor = bMay;
		lado1 = l1;
		lado2 = l2;
		altura = h;
	}
	
	public Double calcularArea(){
		return (((baseMenor + baseMayor)*altura)/2);
	}

	public Double calcularPerimetro(){
		return (baseMenor + baseMayor + lado1 + lado2);
	}
}