import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {

    // 포켓몬 이름에 대한 리스트
    private final ArrayList pokemons = new ArrayList();

    // 포켓몬 이름 -> cp에 대한 리스트
    private final ArrayList cp = new ArrayList();

    // 즉, 포켓몬 이름 / cp 2개의 리스트로 포켓몬들을 관리

    // name의 이름의 모든 포켓몬을 가져옴

    // 새로운 포켓몬을 추가
    // pokemon에 들어있는 데이터 형태 : name(cp)
    // 여기서 name과 cp를 따로 추출할 방법을 찾아야한다
    public void add(Pokemon pokemon) {

    }

    // 해당 name의 cp가 가장 높은 포켓몬 가져옴
    public Pokemon getStrongest(String name) {

    }

    // cp가 가장 높은 포켓몬 가져옴
    public Pokemon getStrongest() {
    }
}