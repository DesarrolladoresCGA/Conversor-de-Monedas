import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class conversorDeMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tipoConversor[] = { "Conversor de Moneda", "Conversor de Temperatura" };
		String tipoMoneda[] = { "De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
				"De Won Coreano a Pesos" };
		
		String tipoGrado[] = {"Celsius (C) a Kelvin (K)","Celsius (C) a Fahrenheit (F)","Fahrenheit (F) a Celsius (C)"};
		
		double dolar, euro, libras, yen, won, peso;

		dolar = 4.797;
		euro = 5.087;
		libras = 5.846;
		yen = 34.80;
		won = 3.64;

		JComboBox cb = new JComboBox(tipoMoneda);
		JComboBox cb2 = new JComboBox(tipoGrado);

		boolean repetir = true;

		while (repetir) {
			
			String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Menu",
					JOptionPane.DEFAULT_OPTION, null, tipoConversor, cb.getItemAt(0));

			if (seleccion == "Conversor de Moneda") {
				double moneda;
				double total;

				moneda = Double
						.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desee convertir"));

				int modedaCambio;

				modedaCambio = JOptionPane.showConfirmDialog(null, cb,
						"Elija la moneda a la que deseas convertir tu dinero", JOptionPane.CANCEL_OPTION);

				if (modedaCambio == JOptionPane.OK_OPTION) {
					int index = cb.getSelectedIndex();

					if (index == 0) {
						total = Math.round(moneda / dolar);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);

						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 1) {
						total = Math.round(moneda / euro);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 2) {
						total = Math.round(moneda / libras);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 3) {
						total = Math.round(moneda / yen);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 4) {
						total = Math.round(moneda / won);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 5) {
						total = Math.round(moneda * dolar);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 6) {
						total = Math.round(moneda * euro);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 7) {
						total = Math.round(moneda * libras);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 8) {
						total = Math.round(moneda * yen);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 9) {
						total = Math.round(moneda * won);
						JOptionPane.showMessageDialog(null, "Tienes: " + total);
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
				}
			}else {
				double valor;
				double total;

				valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que desee convertir"));
				
				int valorCambio;
				
				valorCambio = JOptionPane.showConfirmDialog(null, cb2,"Elija el tipo de grado a cual quiere convertir", JOptionPane.CANCEL_OPTION);
				
				if (valorCambio == JOptionPane.OK_OPTION) {
					int index = cb2.getSelectedIndex();

					if (index == 0) {
						total = valor + 273;
						JOptionPane.showMessageDialog(null, "Tienes: " + total +" (K)");
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 1) {
						total =  (1.8 * valor) + 32;
						JOptionPane.showMessageDialog(null, "Tienes: " + total + " (F)");
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					if (index == 2) {
						total = (valor - 32) / 1.8;
						JOptionPane.showMessageDialog(null, "Tienes: " + total + " C");
						
						int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Selecionar opcion",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar != JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							repetir = false;
							break;
						} 
					}
					
				}
			}
		}

	}

}

