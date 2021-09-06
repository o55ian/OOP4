package project;

import project.Views.ViewEntryMenu;
import project.Views.ViewItemOptions;
import project.Views.ViewReviewsOptions;
import project.Views.ViewTransactionHistoryOptions;


import javax.swing.text.View;

public class Controller {
    ViewEntryMenu mEntryMenuView;
    ViewItemOptions mItemOptionsView;
    ViewReviewsOptions mReviewOptionsView;
    ViewTransactionHistoryOptions mTransactionHistoryOptionsView;

    public Controller() {
        mEntryMenuView = new ViewEntryMenu();
        mItemOptionsView = new ViewItemOptions();
        mReviewOptionsView = new ViewReviewsOptions();
        mTransactionHistoryOptionsView = new ViewTransactionHistoryOptions();
    }

    public void main() {
        //starts the system and instantiates main method
        doEntryMenu();
    }

    void doEntryMenu() {
        mEntryMenuView.renderMenu();

        int entryMenuSelect = mEntryMenuView.readInput();

        switch (entryMenuSelect) {
            case 0 -> {
                //close system
            }

            case 1 -> {
                // open item options
                doItemOptionsMenu();
            }

            case 2 -> {
                //open review options
                doReviewsOptionsMenu();
            }

            case 3 -> {
                //open transaction history options
                doTransactionHistoryMenu();
            }

            default -> {
                mEntryMenuView.renderError();
                doEntryMenu();
            }
        }
    }

    void doItemOptionsMenu() {
        mItemOptionsView.renderItemOptions();

        int itemOptionsInput = mItemOptionsView.itemOptionsInput();

        switch (itemOptionsInput) {
            case 0 -> {
                //Return to main menu
                mItemOptionsView.returnMainMenu();
                doEntryMenu();
            }
            case 1 -> {
                //Create an item
            }
            case 2 -> {
                //Remove an item
            }
            case 3 -> {
                //Print all registered items
            }
            case 4 -> {
                //Buy an item
            }
            case 5 -> {
                //Update an item's name
            }
            case 6 -> {
                //Update an item's price
            }
        }
    }

    void doReviewsOptionsMenu() {
        mReviewOptionsView.reviewsOptionsMenu();

        int reviewOptionsInput = mReviewOptionsView.reviewsOptionsInput();

        switch (reviewOptionsInput) {
            case 0 -> {
                //Return to main menu
                mReviewOptionsView.returnMainMenu();
                doEntryMenu();
            }
            case 1 -> {
                //Create a review for an Item.
            }
            case 2 -> {
                //Print a specific review of an Item.
            }
            case 3 -> {
                //Print all reviews of an Item.
            }
            case 4 -> {
                //Print mean grade of an Item
            }
            case 5 -> {
                //Print all comments of an Item.
            }
            case 6 -> {
                //Print all registered reviews.
            }
            case 7 -> {
                //Print item(s) with most reviews.
            }
            case 8 -> {
                //Print item(s) with least reviews.
            }
            case 9 -> {
                //Print item(s) with best mean review grade.
            }
            case 10 -> {
                //Print item(s) with worst mean review grade.
            }

        }
    }

    void doTransactionHistoryMenu() {
        mTransactionHistoryOptionsView.transactionHistoryOptions();

        int transactionHistoryOptionsInput = mTransactionHistoryOptionsView.transactionHistoryOptionsInput();

        switch (transactionHistoryOptionsInput) {
            case 0 -> {
                //Return to main menu
                mTransactionHistoryOptionsView.returnMainMenu();
                doEntryMenu();
            }
            case 1 -> {
                //Print total profit from all item purchases
            }
            case 2 -> {
                //Print total units sold from all item purchases
            }
            case 3 -> {
                //Print the total number of item transactions made.
            }
            case 4 -> {
                //Print all transactions made.
            }
            case 5 -> {
                //Print the total profit of a specific item.
            }
            case 6 -> {
                //Print the number of units sold of a specific item.
            }
            case 7 -> {
                //Print all transactions of a specific item.
            }
            case 8 -> {
                //Print item with highest profit.
            }
        }
    }

}
