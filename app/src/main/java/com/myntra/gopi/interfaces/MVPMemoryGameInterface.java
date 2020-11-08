package com.myntra.gopi.interfaces;



public interface MVPMemoryGameInterface {

    void showProgress();

    void hideProgress();

    void processNetworkData();

    void loadNextRandomImageInUI(String url, int indexOfElement);

    int getUniqueDefaultResourceIdWithRemoval();
}
