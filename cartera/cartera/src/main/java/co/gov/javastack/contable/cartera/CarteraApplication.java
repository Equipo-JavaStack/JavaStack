package co.gov.javastack.contable.cartera;

import co.gov.javastack.contable.cartera.entidades.Empleados;
import co.gov.javastack.contable.cartera.entidades.Empresa;
import co.gov.javastack.contable.cartera.entidades.MovimientoDinero;
import co.gov.javastack.contable.cartera.entidades.Rol;
import co.gov.javastack.contable.cartera.entidades.Empleados;
import co.gov.javastack.contable.cartera.entidades.Empresa;
import co.gov.javastack.contable.cartera.entidades.MovimientoDinero;
import co.gov.javastack.contable.cartera.entidades.Rol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarteraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarteraApplication.class, args);
		//EMPRESA
		Empresa empresa = new Empresa(1,"JavaStack","calle 20 #5-5","7219292","12345",true);
		System.out.println(empresa);
		empresa.setDireccionEmpresa("avenida 20 con 15");
		empresa.setTelefonoEmpresa("3007791035");
		empresa.getDireccionEmpresa();
		empresa.getTelefonoEmpresa();
		System.out.println(empresa);

		//ROL
		Rol rol = new Rol(1,"Admin",true);
		System.out.println(rol);
		rol.setDescripcion("operario");
		rol.setEstado(false);
		rol.getDescripcion();
		rol.getEstado();
		System.out.println(rol);

		//EMPLEADO
		Empleados empleado = new Empleados(5,"Diana","Araujo","JavaStack","dianaraujo@javastack.com","12345","Operario",true);
		System.out.println(empleado);
		empleado.setPass("5678");
		empleado.setRol("Admin");
		empleado.getPass();
		empleado.getRol();
		System.out.println(empleado);

		//MOVIMIENTO DINERO
		MovimientoDinero movDin = new MovimientoDinero(50000,20000,"venta producto","Operario");
		System.out.println(movDin);
		movDin.setIngresoDinero(80000);
		movDin.setUsuarioMovimiento("Admin");
		movDin.setConceptoDinero("correcion valor venta");
		movDin.getIngresoDinero();
		movDin.getUsuarioMovimiento();
		movDin.getConceptoDinero();
		System.out.println(movDin);





	}




}
