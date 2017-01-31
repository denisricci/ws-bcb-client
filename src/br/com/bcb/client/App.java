package br.com.bcb.client;
import java.rmi.RemoteException;

import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO;
import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO;
import br.gov.bcb.www3.wssgs.services.FachadaWSSGS.FachadaWSSGSProxy;

public class App {
	public static void main(String[] args) throws RemoteException {
		System.out.println(new FachadaWSSGSProxy().getFachadaWSSGS().getValor(11, "30/01/2017"));	
		WSSerieVO[] valoresSeriesVO = new FachadaWSSGSProxy().getFachadaWSSGS().getValoresSeriesVO(new long[]{11}, "01/01/2017", "30/01/2017");
	
		for(WSSerieVO valor:valoresSeriesVO){
			for(WSValorSerieVO valorSerie:valor.getValores()){
				System.out.println(valorSerie);
			}
			
		}
	}
}
