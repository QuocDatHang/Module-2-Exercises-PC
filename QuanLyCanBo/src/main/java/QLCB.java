import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
    List<CanBo> danhSachCanBo;
    QLCB(){
        this.danhSachCanBo = new ArrayList<>();
    }
    public void addCanBo(CanBo canBo){
        danhSachCanBo.add(canBo);
    }
    public List<CanBo> searchCanBoByName(String name){
        return this.danhSachCanBo.stream().filter(o -> o.getHoTen().contains(name)).collect(Collectors.toList());
    }
    public void showDanhSachCanBo(){
        this.danhSachCanBo.forEach(o -> System.out.println(o.toString()));
    }
}
