package ec.edu.ups.austro.negocio;

import java.sql.SQLException;

import javax.ejb.Local;

import ec.edu.ups.austro.modelo.Cuenta;
import ec.edu.ups.austro.modelo.Movimiento;
import ec.edu.ups.austro.modelo.Transferencia;


@Local
public interface MovimientoONLocal {
	public boolean movimiento(Movimiento movimiento) throws Exception;
	public int movimientoN () throws SQLException;
	public int transferenciaN() throws SQLException;
	public Cuenta cuenta(String nCuenta) throws SQLException;
	public boolean actualizarCuenta(Cuenta cuenta) throws SQLException;
	public boolean crearTransferencia(Transferencia transferencia) throws SQLException;
}
