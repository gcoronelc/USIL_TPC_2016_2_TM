package pe.egcc.ventasweb.service.espec;

import java.util.List;
import pe.egcc.ventasweb.model.Promocion;

public interface PromocionServiceEspec {
  
  List<Promocion> getPromociones(int idprod);
  
}
