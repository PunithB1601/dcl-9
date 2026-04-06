package in.punith.Iservice;
import java.util.List;

import in.punith.dto.ProductDto;

public interface IproductService {
	public ProductDto save(ProductDto productDto);
	public List<ProductDto> getAll();
	public ProductDto getById(Integer pid) throws Exception;
	public void update(ProductDto productDTO,Integer productid) throws Exception;
	public void delete(Integer productid) throws Exception;

}
