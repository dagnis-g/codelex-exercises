package io.codelex.chain;

public class Chain {

    private Link firstLink;

    public Chain(Link firstLink) {
        this.firstLink = firstLink;
    }

    public Link getFirstLink() {
        return firstLink;
    }

    public void addLink(Link newLink) {
        newLink.setNextLink(firstLink);
        this.firstLink = newLink;
    }

    public void printOut() {
        Link current = firstLink;
        System.out.println(current.getValue());
        while (current.getNextLink() != null) {
            System.out.println(current.getNextLink().getValue());
            current = current.getNextLink();
        }
    }

}
