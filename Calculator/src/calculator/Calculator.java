/*package calculator;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener{
        double value; //Almacenará los dígitos inscritos
	double numero=0, resultado=0;
	char operacion = 'n';
	StringBuffer s = new StringBuffer();
	JTextField display;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	JButton bs, br, bd, bm, bp, bi, reset;
	JPanel superior, medio, inferior;
	
	public Calculator() {
		//Interfaz Gráfica para el Usuario
		display = new JTextField();
		b1 = new JButton("1");
                b1.setBackground(new Color(240, 240, 240));
		b2 = new JButton("2");
                b2.setBackground(new Color(240, 240, 240));
		b3 = new JButton("3");
                b3.setBackground(new Color(240, 240, 240));
		b4 = new JButton("4");
                b4.setBackground(new Color(240, 240, 240));
		b5 = new JButton("5");
                b5.setBackground(new Color(240, 240, 240));
		b6 = new JButton("6");
                b6.setBackground(new Color(240, 240, 240));
		b7 = new JButton("7");
                b7.setBackground(new Color(240, 240, 240));
		b8 = new JButton("8");
                b8.setBackground(new Color(240, 240, 240));
		b9 = new JButton("9");
                b9.setBackground(new Color(240, 240, 240));
		b0 = new JButton("0");
                b0.setBackground(new Color(240, 240, 240));
		bs = new JButton("+");
                bs.setBackground(new Color( 255, 184, 87 ));
		br = new JButton("-");
                br.setBackground(new Color( 255, 184, 87 ));
		bd = new JButton("/");
                bd.setBackground(new Color( 255, 184, 87 ));
		bm = new JButton("*");
                bm.setBackground(new Color( 255, 184, 87 ));
		bp = new JButton(".");
                bp.setBackground(new Color(240, 240, 240));
		bi = new JButton("=");
                bi.setBackground(new Color(87, 255, 80));
		reset = new JButton("Limpiar");
                reset.setBackground(new Color(255, 114, 114));
		superior = new JPanel();
		medio = new JPanel();
		inferior = new JPanel();
		
		//Colocar componentes
		setLayout(new BorderLayout());
		superior.setLayout(new BorderLayout());
		superior.add("Center",display);
		display.setEditable(false);
		medio.setLayout(new GridLayout(4,4));
		medio.add(b7);
		medio.add(b8);
		medio.add(b9);
		medio.add(bd);
		medio.add(b4);
		medio.add(b5);
		medio.add(b6);
		medio.add(bm);
		medio.add(b1);
		medio.add(b2);
		medio.add(b3);
		medio.add(br);
		medio.add(b0);
		medio.add(bp);
		medio.add(bi);
		medio.add(bs);
		inferior.setLayout(new BorderLayout());
		inferior.add("Center",reset);
		add("North",superior);
		add("Center",medio);
		add("South",inferior);
		
		//Manejo de eventos por los botones
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bs.addActionListener(this);
		br.addActionListener(this);
		bd.addActionListener(this);
		bm.addActionListener(this);
		bp.addActionListener(this);
		bi.addActionListener(this);
		reset.addActionListener(this);
		
		setBounds(50,50,250,250); //50,50,200,200
		setVisible(true);
		this.setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	//Manejo de los eventos para cada botón
	public void actionPerformed(ActionEvent e) {
		Double digUno, digDos;
		if(e.getSource()==b1) {
			s.append('1');
		}else if(e.getSource()==b2) {
			s.append('2');
		}else if(e.getSource()==b3) {
			s.append('3');
		}else if(e.getSource()==b4) {
			s.append('4');
		}else if(e.getSource()==b5) {
			s.append('5');
		}else if(e.getSource()==b6) {
			s.append('6');
		}else if(e.getSource()==b7) {
			s.append('7');
		}else if(e.getSource()==b8) {
			s.append('8');
		}else if(e.getSource()==b9) {
			s.append('9');
		}else if(e.getSource()==b0) {
			s.append('0');
		}else if(e.getSource()==bp) {
			s.append('.');
		}else if(e.getSource()==br) { //resta
		if(display.getText()!="") {
			digUno = Double.parseDouble(display.getText());
			numero = digUno.doubleValue();
		}
		s = null;
		s = new StringBuffer();
		operacion = 'r';
		}else if(e.getSource()==bd) { //división
			if(display.getText()!="") {
				digUno = Double.parseDouble(display.getText());
				numero = digUno.doubleValue();
			}
			s = null;
			s = new StringBuffer();
			operacion = 'd';
		}else if(e.getSource()==bm) { //multiplicación
			if(display.getText()!="") {
				digUno = Double.parseDouble(display.getText());
				numero = digUno.doubleValue();
			}
			s = null;
			s = new StringBuffer();
			operacion = 'm';
		}else if(e.getSource()== bs) { //suma
			if(display.getText()!= "") {
				digUno = Double.parseDouble(display.getText());
				numero = digUno.doubleValue();
			}
			s = null;
			s = new StringBuffer();
			operacion ='s';
		}else if(e.getSource()==bi) { //Realiza cálculo
			if(display.getText()!="") {
				digDos = Double.parseDouble(display.getText());
				if(operacion=='r') {
					resultado=(numero-digDos.doubleValue());
				}else if(operacion=='d'){
				resultado=(numero/digDos.doubleValue());
			}else if(operacion=='m'){
				resultado=(numero*(digDos.doubleValue()));	
			}else if(operacion=='s') {
				resultado=(numero+digDos.doubleValue());
			}
			}
			s = null;
			s = new StringBuffer();
			s.append(resultado);
		}
		
		//Mostrar Resultado
		display.setText(s.toString());
		
		//Resetear valores
		if(e.getSource()==reset) {
			numero = 0;
			resultado = 0;
			s = null;
			s = new StringBuffer();
			display.setText(s.toString());
		}
	}
	
	//Método Principal
	public static void main(String args[]) {
		Calculator c = new Calculator();
	}
}
*/