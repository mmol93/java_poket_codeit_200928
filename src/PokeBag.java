import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Math;

public class PokeBag {


    // 포켓몬 이름에 대한 리스트
    private ArrayList pokebag_name = new ArrayList();

    // 포켓몬 이름 -> cp에 대한 리스트
    private ArrayList pokebag_cp = new ArrayList();

    // 즉, 포켓몬 이름 / cp 2개의 리스트로 포켓몬들을 관리

    // name의 이름의 모든 포켓몬을 가져옴

    // 새로운 포켓몬을 추가
    // pokemon에 들어있는 데이터 형태 : name(cp)
    public void add(Pokemon pokemon) {
        // 같은 인덱스에는 같은 몬스터의 정보가 들어있음
        pokebag_name.add(pokemon.name);
        pokebag_cp.add(pokemon.cp);
    }

    // 해당 name의 cp가 가장 높은 포켓몬 가져옴
    // 해당 값의 모든 인덱스 가져오기 필요
    // return형으로 Pokemon ??? : 뭔소리임
    public Pokemon getStrongest(String name) {
        if (pokebag_name.contains(name)){

        }
        // 이런식으로 Pokemon의 클래스에서 정보를 가져올 수 있게 한다
        // 이렇게 할려면 name의 가장 높은 cp를 찾아올 수 있어야한다
        return new Pokemon(name, (int)pokebag_cp.get(0));
    }

    // cp가 가장 높은 포켓몬 가져옴
    public Pokemon getStrongest() {
        // if를 사용하여 cp가 가장 높은 몬스터를 가져온다
        //new Pokemon(name, cp)를 이용하여 값을 가져와서 return한다
    }
}