package com.Ljava.design.pattem.behavioral.memento;

/**
 * @Auther 20173
 * @Date 2019-4-11 15:27
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article= new Article("设计模式A","手记内容A","手记图片A");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题:"+article.getTitle()+" 内容:"+article.getContent()+" 图片:"+article.getImgs()+" 暂存成功");
        System.out.println("手记完整信息:"+article);


        System.out.println("修改手记start");

        article.setTitle("设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");

        System.out.println("修改手记end");

        System.out.println("手记完整信息:"+article);

        System.out.println(articleMementoManager.getMemento());
        articleMementoManager.addMemento(article.saveToMemento());
        System.out.println(articleMementoManager.getMemento());


    }
}
