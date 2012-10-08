package com.munmiraflores.gestiondocumental.service.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.com.munmiraflores.gestiondocumental.domain.Documentos;
import pe.com.munmiraflores.gestiondocumental.service.GestiondocumentalService;


public class GestionDocumentalServiceTest {

	
	private GestiondocumentalService gestiondocumentalService = null;
	
	public GestionDocumentalServiceTest()
	{
		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.gestiondocumentalService = (GestiondocumentalService) context.getBean("gestiondocumentalServiceClient");
	}
	
	
	@Test
	public void testGetDatosGenerales()
    {
		Documentos d = new Documentos();
		/*Documentos doc = new Documentos();
		doc.setTpodoccod("EXPE");
		doc.setDoccor(100);
		doc.setDocanonum(2012);
		doc.setDocfchcre("2012-01-05 00:00:00");
		Estados est = new Estados();
		est.setStsdsc("CREADO");
		doc.setEstados(est);
		doc.setDocsolncmp("PRIMAX S.A.");
		Personas per = new Personas();
		per.setDni("               ");
		per.setRuc("201000827141   ");
		doc.setPersonas(per);
		doc.setDocasu("AUTORIZACION PARA BANDEROLAS");
		doc.setDocnumfol(61);
		doc.setDocuoactco(814);
		UnidadOrganica uno = new UnidadOrganica();
		uno.setUniorgnom("ARCHIVO CENTRAL");
		doc.setUnidadOrganica(uno);
		doc.setDoccaractc(582);
		Cargo car = new Cargo();
		car.setCardsc("ARCHIVO GRAL. TECNICO ADMINISTRATIVO II");
		doc.setCargo(car);
		doc.setDocdirfisc("AV. NICOLAS ARRIOLA Nro. 740");
		doc.setDocdircorc("AV. NICOLAS ARRIOLA Nro. 740");
		doc.setDvigucdir(" ");
		doc.setDocobs(" ");
		doc.setDocflghc(0);
		doc.setDocflganx(0);
		doc.setDocflgarc(0);
		doc.setDocusrcre(226);
		Usuarios usua = new Usuarios();
		usua.setUsrlog("ELIVIA    ");
		doc.setUsuariosa(usua);
		doc.setDocfchcre("2012-01-05 00:00:00");
		doc.setDocusrmod(218);
		Usuarios usub = new Usuarios();
		usub.setUsrlog("MSAENZ    ");
		doc.setDocfchmod("2012-06-12 00:00:00");
		doc.setUsuariosb(usub);*/
		//double p1=Util.Redondear(
		d = gestiondocumentalService.getDatosGenerales(2012, 100, "EXPE");
		//System.out.println(lista.size());
		//for(Documentos d:lista) {
			System.out.println("TIPO_NUMERO_ANNO:"+d.getTpodoccod()+"-"+d.getDoccor()+"-"+d.getDocanonum()+" FEC_INGRESO:"+d.getDocfchcre()+
					" ESTADO:"+d.getEstados().getStsdsc()+" SOLICITANTE:"+d.getDocsolncmp()+" DNI:"+d.getPersonas().getDni()+" RUCM:"+d.getPersonas().getRuc()+
					" ASUNTO:"+d.getDocasu()+" FOLIO:"+d.getDocnumfol()+" DOCUOACTCO:"+d.getDocuoactco()+" UO_ACTUAL:"+d.getUnidadOrganica().getUniorgnom()+
					" DOCCARACTC:"+d.getDoccaractc()+" CARGO_ACTUAL:"+d.getCargo().getCardsc()+" DIRE_FISCAL:"+d.getDocdirfisc()+" DIR_CORRESPONDENCIA:"+d.getDocdircorc()+
					" DIR_INMUEBLE:"+d.getDvigucdir()+" OBSERVACIONES:"+d.getDocobs()+" HOJA_DE_CARGO:"+d.getDocflghc()+" ANEXADO:"+d.getDocflganx()+
					" ARCHIVADO:"+d.getDocflgarc()+" DOCUSRCRE:"+d.getDocusrcre()+" USUARIO_CREACIO:"+d.getUsuariosa().getUsrlog()+" FEC_CREACION:"+d.getDocfchcre()+
					" DOCUSRMOD:"+d.getDocusrmod()+" USUARIO_MODIFICA:"+d.getUsuariosb().getUsrlog()+" FEC_MOD:"+d.getDocfchmod());
			/*System.out.println("TIPO_NUMERO_ANNO:EXPE-100-2012 FEC_INGRESO:2012-01-05 00:00:00"+
					" ESTADO:CREADO SOLICITANTE:PRIMAX S.A. DNI:                RUCM:201000827141   "+
					" ASUNTO:AUTORIZACION PARA BANDEROLAS FOLIO:61 DOCUOACTCO:814 UO_ACTUAL:ARCHIVO CENTRAL"+
					" DOCCARACTC:582 CARGO_ACTUAL:ARCHIVO GRAL. TECNICO ADMINISTRATIVO II DIRE_FISCAL:AV. NICOLAS ARRIOLA Nro. 740 DIR_CORRESPONDENCIA:AV. NICOLAS ARRIOLA Nro. 740"+
					" DIR_INMUEBLE:  OBSERVACIONES:  HOJA_DE_CARGO:0 ANEXADO:0"+
					" ARCHIVADO:0 DOCUSRCRE:226 USUARIO_CREACIO:ELIVIA     FEC_CREACION:2012-01-05 00:00:00"+
					" DOCUSRMOD:218 USUARIO_MODIFICA:MSAENZ     FEC_MOD:2012-06-12 00:00:00");*/
		//}
		
		//Assert.assertEquals(12.03, p1,0);
		
		
    }
	
	
	
	
	/*
	@Test
	public void testCalcularTFParaAprobarDSD()
    {
		
		double p1=gestiondocumentalService.calcularNotaFinalDSD(15.0, 12.0,13.5, 9.5, 16.9);
		
		double p2=gestiondocumentalService.calcularTFParaAprobarDSD(15.0, 12.0,13.5, 9.5, 16.9,p1);
		System.out.println(p2);
		
		Assert.assertEquals(13.155000000000001, p2);
		
		
    }
	*/
}
