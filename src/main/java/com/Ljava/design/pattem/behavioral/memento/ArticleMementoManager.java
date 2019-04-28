package com.Ljava.design.pattem.behavioral.memento;

import java.util.Stack;

/**
 * @Auther 20173
 * @Date 2019-4-11 15:20
 * @Des 版本记录
 **/
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
