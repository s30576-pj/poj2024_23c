package org.example;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class GenericList<T> {
    private List<T> list;

    public GenericList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void addAll(List<T> elements) {
        list.addAll(elements);
    }

    public void remove(T element) {
        list.remove(element);
    }
}