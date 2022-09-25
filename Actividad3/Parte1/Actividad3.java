import java.awt.event.*;
import javax.swing.*; 

public class Actividad3
{
    public static void main(String[] args) {
        Chapter3();
    }

    public static void Chapter3(){
        JFrame f = new JFrame("Ejercicios Capitulo 3");

        JLabel l1 = new JLabel("Bienvenido a los ejercicios de Java en interfaz gráfica ");
        // JButton b1 = new JButton("correr");
        JButton b2 = new JButton("Capitulo 3");
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
                Problem18();
            }
        });
    }

    public static void Problem18(){
        JFrame f = new JFrame("Ejercicio 18");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, c3, c4, c5, r1, r2, r3, r4;
        c1 = new JTextField("codigo de empleado (String)");
        c2 = new JTextField("nombres (String)");
        c3 = new JTextField("Numero de horas trabajadas al mes (Double)");
        c4 = new JTextField("Valor hora trabajada (Double)");
        c5 = new JTextField("Porcentaje de retencion de la fuente (Double)");

        r1 = new JTextField("Codigo");
        r2 = new JTextField("Nombres");
        r3 = new JTextField("Salario Bruto");
        r4 = new JTextField("Salario Neto");
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
        f.add(c3);
        f.add(c4);
        f.add(c5);
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
                infoEmpleado clase = new infoEmpleado(c1.getText(),
                                                      c2.getText(), 
                                                      Double.parseDouble(c3.getText()), 
                                                      Double.parseDouble(c4.getText()), 
                                                      Double.parseDouble(c5.getText()));

            r1.setText("Codigo: " + clase.getCodigo());
            r2.setText("Nombres: " + clase.getNombres());
            r3.setText("Salario Bruto: " + Double.toString(clase.getBruto()));
            r4.setText("Salario Neto: " + Double.toString(clase.getNeto()));
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Problem19();
            }
        });
    }

    public static void Problem19(){
        JFrame f = new JFrame("Ejercicio 19");

        JLabel l1 = new JLabel("Llene el campo y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, r1, r2, r3;
        c1 = new JTextField("lado del triangulo (Double)");

        r1 = new JTextField("Perimetro");
        r2 = new JTextField("Altura");
        r3 = new JTextField("Area");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r3.setBounds(100, 270, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);
        r3.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trianguloEquilatero clase = new trianguloEquilatero(
                                                                    Double.parseDouble(c1.getText()));

            r1.setText("Perimetro: " + clase.getPerimetro());
            r2.setText("Altura: " + clase.getAltura());
            r3.setText("Area: " + clase.getArea());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Chapter4();
            }
        });
    }

    public static void Chapter4(){
        JFrame f = new JFrame("Ejercicios Capitulo 4");

        JLabel l1 = new JLabel("Bienvenido a los ejercicios de Java en interfaz gráfica ");
        // JButton b1 = new JButton("correr");
        JButton b2 = new JButton("Capitulo 4");
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
                Problem10();
            }
        });
    }

    public static void Problem10(){
        JFrame f = new JFrame("Ejercicio 10");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, c3, c4, r1, r2, r3;
        c1 = new JTextField("Numero de inscripcion (String)");
        c2 = new JTextField("nombres (String)");
        c3 = new JTextField("Patrimonio (Double)");
        c4 = new JTextField("Estrato social (Double)");

        r1 = new JTextField("Numero de inscripcion");
        r2 = new JTextField("Nombres");
        r3 = new JTextField("Pago de matricula");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);
        c3.setBounds(100, 90, 400, 30);
        c4.setBounds(100, 120, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r2.setBounds(100, 240, 400, 30);
        r3.setBounds(100, 270, 400, 30);
        r1.setEditable(false);
        r2.setEditable(false);
        r3.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Matricula clase = new Matricula(c1.getText(),
                                                c2.getText(), 
                                                Double.parseDouble(c3.getText()), 
                                                Double.parseDouble(c4.getText()));

            r1.setText("Numero de inscripcion: " + clase.getNumero());
            r2.setText("Nombres: " + clase.getNombres());
            r3.setText("Pago de matricula: " + clase.pago());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Problem7();
            }
        });
    }

    public static void Problem7(){
        JFrame f = new JFrame("Ejercicio 7");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, r1;
        c1 = new JTextField("Valor A (Double)");
        c2 = new JTextField("Valor B (Double)");

        r1 = new JTextField();
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r1.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(r1);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Mayor clase = new Mayor(Double.parseDouble(c1.getText()),
                                        Double.parseDouble(c2.getText()));

            r1.setText("El numero A es " + clase.getMayor() + " que el numero B");
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Problem22();
            }
        });
    }

    public static void Problem22(){
        JFrame f = new JFrame("Ejercicio 22");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, c3, r1;
        c1 = new JTextField("Nombre empleado (String)");
        c2 = new JTextField("Salario basico por hora (Double)");
        c3 = new JTextField("Numero de horas trabajadas al mes");

        r1 = new JTextField();
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);
        c3.setBounds(100, 90, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r1.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(r1);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Salario clase = new Salario(c1.getText(),
                                            Double.parseDouble(c2.getText()),
                                            Double.parseDouble(c3.getText()));

            String adicional = "";
            if (clase.getSalarioMensual() > 450000){
                adicional = " gana " + Double.toString(clase.getSalarioMensual());
            }
            r1.setText(clase.getNombre() + adicional);
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Problem23();
            }
        });
    }

    public static void Problem23(){
        JFrame f = new JFrame("Ejercicio 23");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, c2, c3, r1;
        c1 = new JTextField("Valor A (Double)");
        c2 = new JTextField("Valor B (Double)");
        c3 = new JTextField("Valor C (Double)");

        r1 = new JTextField("Soluciones");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);
        c2.setBounds(100, 60, 400, 30);
        c3.setBounds(100, 90, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r1.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(r1);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Ecuacion clase = new Ecuacion(Double.parseDouble(c1.getText()),
                                              Double.parseDouble(c2.getText()),
                                              Double.parseDouble(c3.getText()));

            r1.setText("Soluciones: " + clase.getSolucion1() + ", " + clase.getSolucion2());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Problem40();
            }
        });
    }

    public static void Problem40(){
        JFrame f = new JFrame("Ejercicio 40");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, r1, r2, r3;
        c1 = new JTextField("Numero (Double)");

        r1 = new JTextField("Raiz cuadrada");
        r2 = new JTextField("Cuadrado");
        r3 = new JTextField("Cubo");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r1.setEditable(false);
        r2.setBounds(100, 240, 400, 30);
        r2.setEditable(false);
        r3.setBounds(100, 270, 400, 30);
        r3.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Algebra clase = new Algebra(Double.parseDouble(c1.getText()));

            r1.setText("Raiz Cuadrada: " + clase.getRaiz());
            r2.setText("Cuadrado: " + clase.getCuadrado());
            r3.setText("Cubo: " + clase.getCubo());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f.dispose();
                Problem41();
            }
        });
    }

    public static void Problem41(){
        JFrame f = new JFrame("Ejercicio 41");

        JLabel l1 = new JLabel("Llene los campos y click en correr");
        JButton b1 = new JButton("correr");
        JButton b2 = new JButton("siguiente");
        // No tanto boilerplate
        JTextField c1, r1;
        c1 = new JTextField("Valores separados por comas: 1, 2, 3...");

        r1 = new JTextField("Maximo");
        // Fin del no boilerplate
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,100,30);
        l1.setBounds(200 ,0, 500, 30);
        // No tanto boilerplate
        c1.setBounds(100, 30, 400, 30);

        r1.setBounds(100, 210, 400, 30);
        r1.setEditable(false);

        // Fin del no boilerplate
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // No tanto boilerplate
        f.add(c1);
        f.add(r1);
        // Fin del no boilerplate

        f.setLocation(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);  
        f.setLayout(null); 
        f.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                MayorEnTexto clase = new MayorEnTexto(c1.getText());

            r1.setText("Maximo: " + clase.getMax());
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

class infoEmpleado{
    String codigo;
    String nombres;
    Double horasTrabajadasMes;
    Double valorHoraTrabajada;
    Double porcentajeRetencion;

    public infoEmpleado(String c, String nms, Double hTM, Double vHT, Double pR){
        codigo = c;
        nombres = nms;
        horasTrabajadasMes = hTM;
        valorHoraTrabajada = vHT;
        porcentajeRetencion = pR;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombres(){
        return nombres;
    }

    public Double getBruto(){
        return (horasTrabajadasMes * valorHoraTrabajada);
    }

    public Double getNeto(){
        Double salario = (horasTrabajadasMes * valorHoraTrabajada);
        return (salario - (salario*porcentajeRetencion));
    }
}

class trianguloEquilatero{
    Double lado;
    public trianguloEquilatero(Double l){
        lado = l;
    }

    public Double getPerimetro(){
        return lado*3;
    }

    public Double getAltura(){
        return (Math.pow(3.0, 0.5)*lado)/2;
    }

    public Double getArea(){
        return getAltura() * lado;
    }
}

class Matricula{
    String numeroDeInscripcion;
    String nombres;
    Double patrimonio;
    Double estratoSocial;

    public Matricula(String ndi, String nms, Double p, Double es){
        numeroDeInscripcion = ndi;
        nombres = nms;
        patrimonio = p;
        estratoSocial = es;
    }

    public String getNumero(){
        return numeroDeInscripcion;
    }

    public String getNombres(){
        return nombres;
    }

    public Double pago(){
        if ((estratoSocial > 3) & (patrimonio > 2000000)){
            return (50000.0 + patrimonio*0.03);
        }

        else{
            return 50000.0;
        }
    }
}

class Mayor{
    Double a;
    Double b;
    public Mayor(Double a1, Double b1){
        a = a1;
        b = b1;
    }

    public String getMayor(){
        String respuesta;
        if (a > b){
            respuesta = "Mayor";
        }

        else if (a < b){
            respuesta = "Menor";
        }

        else{
            respuesta = "Igual";
        }

        return respuesta;
    }
}

class Salario{
    String nombre;
    Double salarioHora;
    Double horasTrabajadasMes;
    public Salario(String nm, Double sH, Double hTM){
        nombre = nm;
        salarioHora = sH;
        horasTrabajadasMes = hTM;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getSalarioMensual(){
        return salarioHora * horasTrabajadasMes;
    }
}

class Ecuacion{
    Double a;
    Double b;
    Double c;
    public Ecuacion(Double A, Double B, Double C){
        a = A;
        b = B;
        c = C;
    }

    public Double getSolucion1(){
        Double numerador = -b + Math.sqrt(Math.pow(b,2) - (4*a*c));
        Double denominador = 2*a;

        return numerador/denominador;
    }

    public Double getSolucion2(){
        Double numerador = -b - Math.sqrt(Math.pow(b,2) - (4*a*c));
        Double denominador = 2*a;

        return numerador/denominador;
    }
}

class Algebra{
    Double numero;
    public Algebra(Double n){
        numero = n;
    }

    public Double getRaiz(){
        return Math.pow(numero, 0.5);
    }

    public Double getCuadrado(){
        return Math.pow(numero, 2);
    }

    public Double getCubo(){
        return Math.pow(numero, 3);
    }
}

class MayorEnTexto{
    String texto;
    public MayorEnTexto(String t){
        texto = t;
    }

    public Double getMax(){
        Double num = 0.0, res = 0.0;
        for (int i = 0; i<texto.length(); i++)
        {
            if (Character.isDigit(texto.charAt(i)))
                num = num * 10 + (texto.charAt(i)-'0');
            else
            {
                res = Math.max(res, num);
                num = 0.0;
            }
        }
        return Math.max(res, num);
    }
}
