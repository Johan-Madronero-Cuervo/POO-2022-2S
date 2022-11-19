import java.awt.event.*;
import javax.swing.*; 

public class Ejercicio1 {

    public static void main(String[] args) {

        // Crear un nuevo marco
        JFrame f = new JFrame("Ejercicio 1");
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Archivo");
        JMenu m2 = new JMenu("Pitagoras");
        JMenu m3 = new JMenu("Parabolico");
        JMenu m4 = new JMenu("Ohm");
        JMenu m5 = new JMenu("Acerca");

        // Crear elementos del menu
        JMenuItem m11 = new JMenuItem("Salir");

        JMenuItem m21 = new JMenuItem("Calcular Hipotenusa");

        JMenuItem m31 = new JMenuItem("Tiempo de vuelo");

        JMenuItem m41 = new JMenuItem("Calcular voltaje");
        JMenuItem m42 = new JMenuItem("Calcular corriente");

        JMenuItem m51 = new JMenuItem("Acerca de");

        // Agregar elementos al menu
        m1.add(m11);
        m2.add(m21);
        m3.add(m31);
        m4.add(m41);
        m4.add(m42);
        m5.add(m51);

        // Agregar menu al menu bar
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);

        // Agregar menu bar al marco
        f.setJMenuBar(mb);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Agregar eventos

        m11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                /*
                 * System.exit(0); // Cerrar la aplicacion
                 */

                System.exit(0);

            }

        });

        m21.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                // Crear un nuevo marco
                JFrame f = new JFrame("Calcular hipotenusa");
                JLabel l1, l2, l3;

                // Crear campos de texto
                l1 = new JLabel("Cateto 1");
                l1.setBounds(50, 50, 150, 30);

                l2 = new JLabel("Cateto 2");
                l2.setBounds(50, 100, 150, 30);

                l3 = new JLabel("Hipotenusa");
                l3.setBounds(50, 150, 150, 30);

                JTextField t1, t2, t3;

                t1 = new JTextField();
                t1.setBounds(150, 50, 300, 30);

                t2 = new JTextField();
                t2.setBounds(150, 100, 300, 30);

                t3 = new JTextField();
                t3.setBounds(150, 150, 300, 30);

                // Crear botones
                JButton b = new JButton("Calcular");
                JButton b2 = new JButton("Limpiar");
                JButton b3 = new JButton("Salir");

                b.setBounds(50, 200, 100, 30);
                b2.setBounds(200, 200, 100, 30);
                b3.setBounds(350, 200, 100, 30);

                f.add(l1);
                f.add(l2);
                f.add(l3);

                f.add(t1);
                f.add(t2);
                f.add(t3);

                f.add(b);
                f.add(b2);
                f.add(b3);

                f.setSize(500, 500);
                f.setLayout(null);
                f.setVisible(true);

                b.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        /*
                         * Metodo para calcular la hipotenusa
                         */

                        double cateto1 = Double.parseDouble(t1.getText());
                        double cateto2 = Double.parseDouble(t2.getText());

                        Hipotenusa hipotenusa = new Hipotenusa(cateto1, cateto2);

                        t3.setText(String.valueOf(hipotenusa.calcular()));

                    }

                });

                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        /*
                         * Metodo para limpiar los campos de texto
                         */

                        t1.setText("");
                        t2.setText("");
                        t3.setText("");

                    }

                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        /*
                         * Metodo para cerrar la ventana
                        */

                        f.dispose();

                    }

                });

            }

        });

        m31.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {


                JFrame f = new JFrame("Tiempo de vuelo");
                JLabel l1, l2, l3;

                l1 = new JLabel("Velocidad inicial");
                l1.setBounds(50, 50, 140, 30);

                l2 = new JLabel("Angulo (rad)");
                l2.setBounds(50, 100, 140, 30);

                l3 = new JLabel("Tiempo de vuelo");
                l3.setBounds(50, 150, 140, 30);

                JTextField t1, t2, t3;

                t1 = new JTextField();
                t1.setBounds(170, 50, 250, 30);

                t2 = new JTextField();
                t2.setBounds(170, 100, 250, 30);

                t3 = new JTextField();
                t3.setBounds(170, 150, 250, 30);

                JButton b = new JButton("Calcular");
                JButton b2 = new JButton("Limpiar");
                JButton b3 = new JButton("Salir");

                b.setBounds(50, 200, 100, 30);
                b2.setBounds(200, 200, 100, 30);
                b3.setBounds(350, 200, 100, 30);


                f.add(l1);
                f.add(l2);
                f.add(l3);

                f.add(t1);
                f.add(t2);
                f.add(t3);

                f.add(b);
                f.add(b2);
                f.add(b3);

                f.setSize(500, 500);
                f.setLayout(null);
                f.setVisible(true);


                b.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para calcular el tiempo de vuelo

                        double velocidad = Double.parseDouble(t1.getText());

                        double angulo = Double.parseDouble(t2.getText());

                        Parabolico parabolico = new Parabolico(velocidad, angulo);

                        t3.setText(String.valueOf(parabolico.calcularTiempo()));
                    }

                });

                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para limpiar los campos de texto

                        t1.setText("");
                        t2.setText("");
                        t3.setText("");

                    }

                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para cerrar la ventana

                        f.dispose();

                    }

                });

            }

        });


        m41.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame f = new JFrame("Calcular voltaje");
                JLabel l1, l2, l3;

                l1 = new JLabel("Resistencia");
                l1.setBounds(50, 50, 100, 30);

                l2 = new JLabel("Corriente");
                l2.setBounds(50, 100, 100, 30);

                l3 = new JLabel("Voltaje");
                l3.setBounds(50, 150, 100, 30);

                JTextField t1, t2, t3;

                t1 = new JTextField();
                t1.setBounds(150, 50, 300, 30);

                t2 = new JTextField();
                t2.setBounds(150, 100, 300, 30);

                t3 = new JTextField();
                t3.setBounds(150, 150, 300, 30);


                JButton b = new JButton("Calcular");
                JButton b2 = new JButton("Limpiar");
                JButton b3 = new JButton("Salir");

                b.setBounds(50, 200, 100, 30);
                b2.setBounds(200, 200, 100, 30);
                b3.setBounds(350, 200, 100, 30);

                f.add(l1);

                f.add(l2);

                f.add(l3);

                f.add(t1);

                f.add(t2);

                f.add(t3);

                f.add(b);
                f.add(b2);
                f.add(b3);

                f.setSize(500, 500);
                f.setLayout(null);
                f.setVisible(true);

                b.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para calcular el voltaje

                        double resistencia = Double.parseDouble(t1.getText());

                        double corriente = Double.parseDouble(t2.getText());

                        ohm ohm = new ohm(resistencia, 0, corriente);

                        t3.setText(String.valueOf(ohm.calcularVoltaje()));

                    }

                });

                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para limpiar los campos de texto

                        t1.setText("");
                        t2.setText("");
                        t3.setText("");

                    }

                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para cerrar la ventana

                        f.dispose();

                    }

                });

            }

        });

        m42.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame f = new JFrame("Calcular corriente");

                JLabel l1, l2, l3;

                l1 = new JLabel("Resistencia");
                l1.setBounds(50, 50, 100, 30);

                l2 = new JLabel("Voltaje");
                l2.setBounds(50, 100, 100, 30);

                l3 = new JLabel("Corriente");
                l3.setBounds(50, 150, 100, 30);

                JTextField t1, t2, t3;

                t1 = new JTextField();
                t1.setBounds(150, 50, 300, 30);
                

                t2 = new JTextField();
                t2.setBounds(150, 100, 300, 30);

                t3 = new JTextField();
                t3.setBounds(150, 150, 300, 30);

                JButton b = new JButton("Calcular");
                JButton b2 = new JButton("Limpiar");
                JButton b3 = new JButton("Salir");

                b.setBounds(50, 200, 100, 30);
                b2.setBounds(200, 200, 100, 30);
                b3.setBounds(350, 200, 100, 30);

                f.add(l1);
                f.add(l2);
                f.add(l3);

                f.add(t1);
                f.add(t2);
                f.add(t3);

                f.add(b);
                f.add(b2);
                f.add(b3);

                f.setSize(500, 500);
                f.setLayout(null);
                f.setVisible(true);

                b.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para calcular la corriente

                        double resistencia = Double.parseDouble(t1.getText());

                        double voltaje = Double.parseDouble(t2.getText());

                        ohm ohm = new ohm(resistencia, voltaje, 0);

                        t3.setText(String.valueOf(ohm.calcularCorriente()));
                    }

                });

                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para limpiar los campos de texto

                        t1.setText("");
                        t2.setText("");
                        t3.setText("");

                    }

                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para cerrar la ventana

                        f.dispose();

                    }

                });

            }

        });

        m51.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Ventana para mas informacion del programa

                JFrame f = new JFrame("Acerca de");

                String texto = "Este programa fue creado en la asignatura POO 2022-02 por: \n" + 
                        "Johan Madroñero Cuervo \n" +
                        "Dioselin Esteban Brito Peñaloza \n" +
                        "Juan David Cardenas Jimenez \n\n" + 
                        "Universidad Nacional de Colombia, 2022";
                
                JTextArea t = new JTextArea(texto);


                t.setBounds(50, 50, 400, 200);
                t.setEditable(false);
                t.setLineWrap(true);
                t.setWrapStyleWord(true);
                t.setBackground(f.getBackground());


                JButton b = new JButton("Salir");

                b.setBounds(200, 300, 100, 30);

                f.add(t);
                f.add(b);

                f.setSize(500, 500);
                f.setLayout(null);
                f.setVisible(true);

                b.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Metodo para cerrar la ventana

                        f.dispose();

                    }

                });

            }

        });

    }
             

}


class Hipotenusa {
    double cateto1;
    double cateto2;

    public Hipotenusa(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double calcular() {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

    }

}

class ohm {
    double resistencia;
    double voltaje;
    double corriente;

    public ohm(double resistencia, double voltaje, double corriente) {
        this.resistencia = resistencia;
        this.voltaje = voltaje;
        this.corriente = corriente;
    }

    public double calcularVoltaje() {
        return resistencia * corriente;
    }

    public double calcularCorriente() {
        return voltaje / resistencia;
    }


}

class Parabolico {
    double velocidad;
    double angulo;

    public Parabolico(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }

    public double calcularTiempo() {
        return (2 * velocidad * Math.sin(angulo)) / 9.8;
    }

}