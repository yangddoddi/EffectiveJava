package com.example.effectivejava.chapter4.item15.post;

// 굳이 외부에서 구현체를 알아야할 이유가 없음.
class DefaultPostService implements PostService {
    // 퍼블릭 클래스의 필드는 퍼블릭이 아니여야 한다.
    private int value = 3;

    // 상수는 퍼블릭이여도 된다.
    public final int LIMIT = 100;

    // 내부에서만 사용할 것이므로 private
    private PostRepository postRepository;

    // 외부에서 접근 가능한 정적 참조 변수를 가져서는 안된다.
    public static final String[] arr = new String[10];

    // 외부에서 사용하는 public
    public void savePost() {
        postRepository.savePost();
    }

    public void loadPost() {
        System.out.println("load");
    }

    /*
    * why static class?
    * inner class는 항상 외부 클래스를 참조한다.
    * static inner class는 외부 클래스를 참조하지 않는다.
    * */
    private static class PostRepository {
        public void savePost() {
            System.out.println("save");
            // loadPost() => 안된다
        }

        public void deletePost() {
            System.out.println("delete");
        }
    }

    // 외부를 참조하고 있으므로 아무렇게나 외부의 메서드를 사용 가능
    // 둘이 별개의 역할을 하는데 참조하게 할 이유가 없다.
    private class InnerClass {
        public void haha() {
            loadPost();
        }
    }
}
