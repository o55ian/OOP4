package project;

import project.Model.Items;
import project.Model.Model;
import project.Model.TransactionHistory;
import project.Views.*;
import project.review.CreateReviews;
import project.Views.ViewTransactionHistory;

import java.util.Collection;
import java.util.UUID;

public class Controller {
    Model mModel;
    ViewMainMenu mMainMenuView;
    ViewItemOptions mItemOptionsView;
    ViewReviewsOptions mReviewOptionsView;
    ViewTransactionHistoryOptions mTransactionHistoryOptionsView;
    ViewCreateItem mCreateItemView;
    ViewTransactionHistory mTransactionHistoryView;

    public Controller() {
        mModel = new Model();
        mModel.addItem(new Items ("Jeans", 800.0));
        mModel.addItem(new Items ("Shirt", 1500.0));
        mMainMenuView = new ViewMainMenu();
        mItemOptionsView = new ViewItemOptions();
        mReviewOptionsView = new ViewReviewsOptions();
        mTransactionHistoryOptionsView = new ViewTransactionHistoryOptions();
        mCreateItemView = new ViewCreateItem();
        mTransactionHistoryView = new ViewTransactionHistory();

    }

    public void main() {
        //starts the system and instantiates main method
        doMainMenu();
    }

    void doMainMenu() {
        mMainMenuView.renderMenu();

        int mainMenuSelect = mMainMenuView.readInput();

        switch (mainMenuSelect) {
            case 0:
                //close system

            case 1:
                // open item options
                doItemOptionsMenu();


            case 2:
                //open review options
                doReviewsOptionsMenu();


            case 3:
                //open transaction history options
                doTransactionHistoryMenu();


            default:
                mMainMenuView.renderError();
                doMainMenu();
                break;
        }
    }

    void doItemOptionsMenu() {
        mItemOptionsView.renderItemOptions();

        int itemOptionsInput = mItemOptionsView.itemOptionsInput();

        switch (itemOptionsInput) {
            case 0 :
                //Return to main menu
                mItemOptionsView.returnMainMenu();
                doMainMenu();


            case 1 :
                //Create an item
                Items item = mCreateItemView.enterItemData();
                mModel.addItem(item);
                mCreateItemView.creationSuccess(item.getID());
                doMainMenu();
                break;
            case 2 :
                //Remove an item

                break;
            case 3 :

                //Print all registered items

            case 4 :
                //Buy an item

            case 5 :
                //Update an item's name

            case 6 :
                //Update an item's price

        }
    }

    void doReviewsOptionsMenu() {
        mReviewOptionsView.reviewsOptionsMenu();

        int reviewOptionsInput = mReviewOptionsView.reviewsOptionsInput();

        switch (reviewOptionsInput) {
            case 0:
                //Return to main menu
                mReviewOptionsView.returnMainMenu();
                doMainMenu();
                break;
            case 1 :
              CreateReviews createReviews = new CreateReviews(mModel);
              createReviews.createReview();


                //Create a review for an Item.

            case 2 :
                //Print a specific review of an Item.

            case 3 :
                //Print all reviews of an Item.

            case 4 :
                //Print mean grade of an Item

            case 5 :
                //Print all comments of an Item.

            case 6 :
                //Print all registered reviews.

            case 7 :
                //Print item(s) with most reviews.

            case 8 :
                //Print item(s) with least reviews.

            case 9 :
                //Print item(s) with best mean review grade.

            case 10 :
                //Print item(s) with worst mean review grade.

        }
    }

    void doTransactionHistoryMenu() {
        mTransactionHistoryOptionsView.transactionHistoryOptions();

        int transactionHistoryOptionsInput = mTransactionHistoryOptionsView.transactionHistoryOptionsInput();

        switch (transactionHistoryOptionsInput) {
            case 0 :
                //Return to main menu
                mTransactionHistoryOptionsView.returnMainMenu();
                doMainMenu();
                break;
            case 1 :
                //Print total profit from all item purchases

            case 2 :
                //Print total units sold from all item purchases

            case 3 :
                //Print the total number of item transactions made.

            case 4 :
                //Print all transactions made.

            case 5 :
                //Print the total profit of a specific item.

            case 6 :
                //Print the number of units sold of a specific item.
                System.out.println("testing git");
            case 7 :
                //Print all transactions of a specific item.
                UUID itemID;

                //output list of all items
                mTransactionHistoryView.listItems(mModel.getItemList());
                //store item ID into variable
                itemID = mTransactionHistoryView.readItemID();
                //output transaction history for item
                mTransactionHistoryView.showTransactionData(itemID);
                Items item = mModel.getItemByID(itemID);
                mTransactionHistoryView.showTransactionData(item);
                Collection<TransactionHistory> itemTransactionHistory = mModel.getTransactionForItem(item);
                System.out.println();
            case 8 :
                //Print item with highest profit.
                ViewTransactionHistory viewTransactionHistory1 = new ViewTransactionHistory();
                viewTransactionHistory1.readItemID();
                break;
            default:

        }
    }

}
