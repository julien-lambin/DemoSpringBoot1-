package com.kf.demo.web.controller;

import com.kf.demo.dao.GameDao;
import com.kf.demo.dao.ProductDao;
import com.kf.demo.model.Game;
import com.kf.demo.model.GameProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameDao gameDao;

    @Autowired
    private ProductDao productDao;

    //Récupérer la liste des jeux
    @GetMapping(value = "/games")
    public List <Game> listeJeux() {
        return gameDao.findAll();
    }

   /* @GetMapping(value = "/game-produit")
    public GameProduct liste(){

        GameProduct gameProduct = new GameProduct();
        gameProduct.setGameList(gameDao.findAll());
        gameProduct.setProductList(productDao.findAll());


        return gameProduct;
    }*/


    }

