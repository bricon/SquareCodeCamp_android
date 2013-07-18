package com.example.android101.data;

import android.location.Location;
import com.example.android101.data.model.CuratedImage;
import com.example.android101.data.model.Images;
import com.example.android101.data.model.LatLong;
import com.example.android101.data.model.User;

/** Fake data. Because real data is hard! */
public class MockData {
  public static final Location SQUARE = locationAt(37.782436, -122.406621, 40f);

  private static Location locationAt(double lat, double lon, float accuracy) {
    Location location = new Location("gps");
    location.setLatitude(lat);
    location.setLongitude(lon);
    location.setAccuracy(accuracy);
    return location;
  }

  public static final User[] MERCHANTS = new User[] {
      new User("596079", "Square Kitchen", null, true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/5dd56531308f1d30b7a09f3a648e436012a64c40/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/tree0H-qCRoRNkSuEzY7KnpoVdE=/60x60/https://d1g145x70srn7h.cloudfront.net/files/5dd56531308f1d30b7a09f3a648e436012a64c40/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/zBL6dIqbbg5E0neyzOlwz5XNrv4=/200x200/https://d1g145x70srn7h.cloudfront.net/files/5dd56531308f1d30b7a09f3a648e436012a64c40/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/_7xemotf1VL-7W2bqBiE5H-y5IU=/400x400/https://d1g145x70srn7h.cloudfront.net/files/5dd56531308f1d30b7a09f3a648e436012a64c40/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/f14c4170f60a6ceaecd04915ee4b6ab5862538c4/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/ywLzFiVlbqfVO_B6u1dt7-mHQ4Q=/576x320/https://d1g145x70srn7h.cloudfront.net/files/f14c4170f60a6ceaecd04915ee4b6ab5862538c4/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/kDPaDA990tVHlrBb4QXlDzR9-xE=/286x160/https://d1g145x70srn7h.cloudfront.net/files/f14c4170f60a6ceaecd04915ee4b6ab5862538c4/original.png"),
          new LatLong(37.781793, -122.406105)), new User("898097", "Square Tavern", null, true,
      new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/481a6c37af8c75c317dd7610caab345c43d18aad/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/nAPwdGukZwcBsc1Pxu81zbQmWPI=/60x60/https://d1g145x70srn7h.cloudfront.net/files/481a6c37af8c75c317dd7610caab345c43d18aad/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/RrJh7ypdCAoEutQLiNMOvuqgPHc=/200x200/https://d1g145x70srn7h.cloudfront.net/files/481a6c37af8c75c317dd7610caab345c43d18aad/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/k2b6O2UDuKEhARo9Mu6q7E4y6RY=/400x400/https://d1g145x70srn7h.cloudfront.net/files/481a6c37af8c75c317dd7610caab345c43d18aad/original.png"),
      new CuratedImage(
          "https://d1g145x70srn7h.cloudfront.net/files/ada01ad451b98a4615486bae2c8bd35aa1244a3f/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/eeMi5WAWKr5N7pedL_o-792V0CE=/576x320/https://d1g145x70srn7h.cloudfront.net/files/ada01ad451b98a4615486bae2c8bd35aa1244a3f/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/02BRVkwXoNBpiu49h4mC_Zv-4EE=/286x160/https://d1g145x70srn7h.cloudfront.net/files/ada01ad451b98a4615486bae2c8bd35aa1244a3f/original.png"),
      new LatLong(37.781793, -122.406105)),
      new User("5686603", "Blue Bottle Coffee", "info@bluebottlecoffee.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/e25686fc569779cca7eb8e3505be0b89939ed761/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/1iE_TjoXHSYYYoOnQl2xpiE_K8k=/60x60/https://d1g145x70srn7h.cloudfront.net/files/e25686fc569779cca7eb8e3505be0b89939ed761/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/JL3ynLPKJ9BapWM0p3N-cZFQtaE=/200x200/https://d1g145x70srn7h.cloudfront.net/files/e25686fc569779cca7eb8e3505be0b89939ed761/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/xEWyfbWwLsiNzmhYaJB_bL9UM4A=/400x400/https://d1g145x70srn7h.cloudfront.net/files/e25686fc569779cca7eb8e3505be0b89939ed761/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/e3a25f06bf5df92d9708b72bb5b8c355d7c8cac7/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/q6-7qtKwN92jSq10BSFlFHpJXdI=/0x468:4256x2832/576x320/https://d1g145x70srn7h.cloudfront.net/files/e3a25f06bf5df92d9708b72bb5b8c355d7c8cac7/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/V2dgx-mqWHI7ZnrgeFUvuKC558Q=/0x451:4256x2832/286x160/https://d1g145x70srn7h.cloudfront.net/files/e3a25f06bf5df92d9708b72bb5b8c355d7c8cac7/original.jpeg"),
          new LatLong(37.7823753, -122.4075668)),
      new User("3871299", "Starbucks", "siren@squareup.com", false, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/ae12d6e051e4ee7a5f3ef893d317766e11f44df3/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/zbc-h2ik-7jEeS4wvF2DHm4zHmo=/60x60/https://d1g145x70srn7h.cloudfront.net/files/ae12d6e051e4ee7a5f3ef893d317766e11f44df3/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/HM99m8xU_s5IkS0w9oJDS4e9tvQ=/200x200/https://d1g145x70srn7h.cloudfront.net/files/ae12d6e051e4ee7a5f3ef893d317766e11f44df3/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/2uuMbOTpqP3ni0sWJJt9duI2XCk=/400x400/https://d1g145x70srn7h.cloudfront.net/files/ae12d6e051e4ee7a5f3ef893d317766e11f44df3/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/f9e71529ed7d7f679ffe03a1feba36ff0a086ded/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/AISHCBKBgmFygO4jmj0XHzjXnA8=/576x320/https://d1g145x70srn7h.cloudfront.net/files/f9e71529ed7d7f679ffe03a1feba36ff0a086ded/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/e2y8rQc8VmYhwX030x2GEqVqNns=/286x160/https://d1g145x70srn7h.cloudfront.net/files/f9e71529ed7d7f679ffe03a1feba36ff0a086ded/original.png"),
          new LatLong(37.7839393616, -122.4071502686)),
      new User("898886", "Square Coffee Bar", "squarecoffeebar@squareup.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/cf0a0d1b90e2a919316e43026df5f33ce3f4b455/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/yuvxyZU_jhwKwV_v3UlvjNRMczA=/60x60/https://d1g145x70srn7h.cloudfront.net/files/cf0a0d1b90e2a919316e43026df5f33ce3f4b455/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/atbFLe3EZhSye3tE85X4tvSn9Ew=/200x200/https://d1g145x70srn7h.cloudfront.net/files/cf0a0d1b90e2a919316e43026df5f33ce3f4b455/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/MAeLlGR9TbvlBqQbZOO9DVn7bU0=/400x400/https://d1g145x70srn7h.cloudfront.net/files/cf0a0d1b90e2a919316e43026df5f33ce3f4b455/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/897771fde7317c8e3a39aee7041ac5e9d3376ca3/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/M1r94tgP-xoLOGCSKwUoGYNt1C8=/576x320/https://d1g145x70srn7h.cloudfront.net/files/897771fde7317c8e3a39aee7041ac5e9d3376ca3/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/2x1lbwF3s3tyZ3S5brdDjsKNC1c=/286x160/https://d1g145x70srn7h.cloudfront.net/files/897771fde7317c8e3a39aee7041ac5e9d3376ca3/original.png"),
          new LatLong(37.7826065, -122.4062481)), new User("2823579", "Tempest Box", null, true,
      new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/a28fc7c9a45d4a30bf4867b8b616db3f5664f25e/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/oKABp1-pe3FNSo4Ras5cU3wIvKA=/60x60/https://d1g145x70srn7h.cloudfront.net/files/a28fc7c9a45d4a30bf4867b8b616db3f5664f25e/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/q9yEZHHRfiCDvzohpSebAQxdMzw=/200x200/https://d1g145x70srn7h.cloudfront.net/files/a28fc7c9a45d4a30bf4867b8b616db3f5664f25e/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/2Z3bcxr94e3RX_RWf1zgMaiuk_U=/400x400/https://d1g145x70srn7h.cloudfront.net/files/a28fc7c9a45d4a30bf4867b8b616db3f5664f25e/original.jpeg"),
      new CuratedImage(
          "https://d1g145x70srn7h.cloudfront.net/files/c76e93752955cf994ce453f30f7227b5a6d79f49/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/49xLarfWgky-d_5GHxXe_v_0Rlw=/576x320/https://d1g145x70srn7h.cloudfront.net/files/c76e93752955cf994ce453f30f7227b5a6d79f49/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/8RqiQ2GqgiR5zmqsgLJAqjPk3jQ=/286x160/https://d1g145x70srn7h.cloudfront.net/files/c76e93752955cf994ce453f30f7227b5a6d79f49/original.jpeg"),
      new LatLong(37.7812383, -122.4063037)), new User("2854057", "Cafe Venue", null, true,
      new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/3df08d28ebecd548cfcc266e6616ceb84f00de7d/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/36vOyyEC28Amq5izFe_vGjTg8IQ=/60x60/https://d1g145x70srn7h.cloudfront.net/files/3df08d28ebecd548cfcc266e6616ceb84f00de7d/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/bi82P7zwu3wNhKHLpPIGFeRUZeE=/200x200/https://d1g145x70srn7h.cloudfront.net/files/3df08d28ebecd548cfcc266e6616ceb84f00de7d/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/rRIn2XmQ2SKaXm48KNPilJbDe6Y=/400x400/https://d1g145x70srn7h.cloudfront.net/files/3df08d28ebecd548cfcc266e6616ceb84f00de7d/original.jpeg"),
      new CuratedImage(
          "https://d1g145x70srn7h.cloudfront.net/files/0b46b6e506ac94c745502a3f4f36edc125b3f931/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/VVMP1Hhht0T5qvgDnJegSPpDHn0=/576x320/https://d1g145x70srn7h.cloudfront.net/files/0b46b6e506ac94c745502a3f4f36edc125b3f931/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/awngVOo233RIsnSvr7F2nUp8OPE=/286x160/https://d1g145x70srn7h.cloudfront.net/files/0b46b6e506ac94c745502a3f4f36edc125b3f931/original.png"),
      new LatLong(37.7832002, -122.4069589)),
      new User("3810600", "drip module", "info@dripmodule.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/c17198bf30a9242317cce2feacec5f31e090d050/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/NIA1rT2jM9mSKLWYBJRCVvGA1N0=/60x60/https://d1g145x70srn7h.cloudfront.net/files/c17198bf30a9242317cce2feacec5f31e090d050/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/Me6UgyZwJQ0_zbNumFE0pUSMhXI=/200x200/https://d1g145x70srn7h.cloudfront.net/files/c17198bf30a9242317cce2feacec5f31e090d050/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/pNsEhXBTxlEyjnJgvHYz3HrPIYs=/400x400/https://d1g145x70srn7h.cloudfront.net/files/c17198bf30a9242317cce2feacec5f31e090d050/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/264e7981fcd224328d3141f857b12afaeafa75c1/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/sdHQYsaN1oGIX5GdCP0CyE5h1w4=/576x320/https://d1g145x70srn7h.cloudfront.net/files/264e7981fcd224328d3141f857b12afaeafa75c1/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/Sr1GawEwVL_P7ja1NmsJF0hc4D4=/286x160/https://d1g145x70srn7h.cloudfront.net/files/264e7981fcd224328d3141f857b12afaeafa75c1/original.jpeg"),
          new LatLong(37.7810687, -122.4056821)),
      new User("5500590", "go/behealthy", "behealthy@squareup.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/296e810bb410ec98635b57d04bfbb93433380bcf/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/UU91DERXILzhdUta0hbN4I7OFf4=/60x60/https://d1g145x70srn7h.cloudfront.net/files/296e810bb410ec98635b57d04bfbb93433380bcf/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/SzemIKrQ3ZwI4Ifv-2JB7gZrvw4=/200x200/https://d1g145x70srn7h.cloudfront.net/files/296e810bb410ec98635b57d04bfbb93433380bcf/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/JGaH89wSkCILvWrFgLhCjlrUbcc=/400x400/https://d1g145x70srn7h.cloudfront.net/files/296e810bb410ec98635b57d04bfbb93433380bcf/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/946211b6b279bc69d149421793e48c0ab090c909/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/mKPf1HBX_BVk8OOZ24O4Y9eMDFs=/51x0:1343x718/576x320/https://d1g145x70srn7h.cloudfront.net/files/946211b6b279bc69d149421793e48c0ab090c909/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/-ofU2IhZo8Ef_Ges1O2_0sicrms=/56x0:1339x718/286x160/https://d1g145x70srn7h.cloudfront.net/files/946211b6b279bc69d149421793e48c0ab090c909/original.png"),
          new LatLong(37.7821494, -122.405896)),
      new User("1084578", "San Francisco Museum & Historical Society", "info@sfhistory.org", true,
          new Images(
              "https://d1g145x70srn7h.cloudfront.net/files/a4ccff424bd0872dc999ac3b10e1df6b530b7e17/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/kDyvEV8mATx6wi-e4hpSNsXft8U=/60x60/https://d1g145x70srn7h.cloudfront.net/files/a4ccff424bd0872dc999ac3b10e1df6b530b7e17/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/Y6fqitE5sqNKvCzWOw24KuT0pSs=/200x200/https://d1g145x70srn7h.cloudfront.net/files/a4ccff424bd0872dc999ac3b10e1df6b530b7e17/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/MldqGHh4aEei8Q-UUjG3dsZvB1Y=/400x400/https://d1g145x70srn7h.cloudfront.net/files/a4ccff424bd0872dc999ac3b10e1df6b530b7e17/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/0f01f9a421d18a94eb452eb1f93fadd9d907a179/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/oz5GhJKsoZBJ6xuoRCEDC3k26Vo=/576x320/https://d1g145x70srn7h.cloudfront.net/files/0f01f9a421d18a94eb452eb1f93fadd9d907a179/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/JzsQyqhR2iwlmA5y8o1_exzIrJw=/286x160/https://d1g145x70srn7h.cloudfront.net/files/0f01f9a421d18a94eb452eb1f93fadd9d907a179/original.jpeg"),
          new LatLong(37.7832388002, -122.4071727373)),
      new User("637658", "Baker’s Dozen", null, true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/cc4cd6f593f50900c816c66285db1486038b75a7/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/JNnfqRDcIGg4AtuJW03CcT-Ha5A=/60x60/https://d1g145x70srn7h.cloudfront.net/files/cc4cd6f593f50900c816c66285db1486038b75a7/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/qaEwiheOAFv-tYky5NBpg6BA0x0=/200x200/https://d1g145x70srn7h.cloudfront.net/files/cc4cd6f593f50900c816c66285db1486038b75a7/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/fhGi9letBHU5LhW48nYhE4Dkk40=/400x400/https://d1g145x70srn7h.cloudfront.net/files/cc4cd6f593f50900c816c66285db1486038b75a7/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/d3aa2a29b6440d4c7dba66fe4ad7e81db1780d01/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/yLohEGW3w7s9uLMfI-yjGlJCu8o=/576x320/https://d1g145x70srn7h.cloudfront.net/files/d3aa2a29b6440d4c7dba66fe4ad7e81db1780d01/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/LAZ4iMXITGUKz1LVzMTbjQ5b6eE=/286x160/https://d1g145x70srn7h.cloudfront.net/files/d3aa2a29b6440d4c7dba66fe4ad7e81db1780d01/original.png"),
          new LatLong(37.7824520148, -122.406665653)),
      new User("5400273", "Burberry", "customerservice@burberry.com", false, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/eecae436339986429c034e890d4ecc5c9fa694b8/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/pvfjNBd147lMrT3HeJUnyybt4ew=/60x60/https://d1g145x70srn7h.cloudfront.net/files/eecae436339986429c034e890d4ecc5c9fa694b8/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/6SeiEM0uyKa1pqvnrwjUXGwXyzA=/200x200/https://d1g145x70srn7h.cloudfront.net/files/eecae436339986429c034e890d4ecc5c9fa694b8/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/KxNTMUXbdhCnCY50s1aSFJsCY9s=/400x400/https://d1g145x70srn7h.cloudfront.net/files/eecae436339986429c034e890d4ecc5c9fa694b8/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/63fadb5d4a3efce70f3b36b4644e236c736bf376/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/7S6Yme5xXqGluStZd15v1jIy-Tk=/576x320/https://d1g145x70srn7h.cloudfront.net/files/63fadb5d4a3efce70f3b36b4644e236c736bf376/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/Yij9VXwYnujswSEoru_3Tk-gRgk=/286x160/https://d1g145x70srn7h.cloudfront.net/files/63fadb5d4a3efce70f3b36b4644e236c736bf376/original.jpeg"),
          new LatLong(37.784219, -122.406176)), new User("3781314", "Split Pea", null, true,
      new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/78713009a8a2962fe7ea882bf98ce2e489baf1f3/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/6sx9BYzsPSnX_nzMfz3mzaSuROc=/60x60/https://d1g145x70srn7h.cloudfront.net/files/78713009a8a2962fe7ea882bf98ce2e489baf1f3/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/lwDWAn6XI3lRKmFs62Ekv5F3zJQ=/200x200/https://d1g145x70srn7h.cloudfront.net/files/78713009a8a2962fe7ea882bf98ce2e489baf1f3/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/UkmbeAmOtdeIGVDllxWF_aFyxX0=/400x400/https://d1g145x70srn7h.cloudfront.net/files/78713009a8a2962fe7ea882bf98ce2e489baf1f3/original.jpeg"),
      new CuratedImage(
          "https://d1g145x70srn7h.cloudfront.net/files/be9da4d6ac160f738bfe50bca8026f0c6c2bc78a/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/BIoSy60CtoEjLJU2MH1tdybmdkk=/576x320/https://d1g145x70srn7h.cloudfront.net/files/be9da4d6ac160f738bfe50bca8026f0c6c2bc78a/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/gj0bXHDeKvzB8dFDw3ocJ2vH9BI=/286x160/https://d1g145x70srn7h.cloudfront.net/files/be9da4d6ac160f738bfe50bca8026f0c6c2bc78a/original.jpeg"),
      new LatLong(37.7803635, -122.4081286)),
      new User("2843918", "50 Mason Social House", null, true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/dc34814071a9201273df9c7ba33d1874365cd34e/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/rEUgFm-_9LjM0Pl_i3V9t9QVS68=/60x60/https://d1g145x70srn7h.cloudfront.net/files/dc34814071a9201273df9c7ba33d1874365cd34e/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/zVs4r0bfyyJK6qvv-8ksmubZzE0=/200x200/https://d1g145x70srn7h.cloudfront.net/files/dc34814071a9201273df9c7ba33d1874365cd34e/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/kLFGwqa80IudB5vWl-0RCmRoDLc=/400x400/https://d1g145x70srn7h.cloudfront.net/files/dc34814071a9201273df9c7ba33d1874365cd34e/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/7e2d9f39cfb72f09182a315c14eb9ac97396f49d/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/doNJ-m-DOn58JKGJLyKFTGPRDnc=/576x320/https://d1g145x70srn7h.cloudfront.net/files/7e2d9f39cfb72f09182a315c14eb9ac97396f49d/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/Trg0UNd1OCp6CKdMBxgEAB0ttOc=/286x160/https://d1g145x70srn7h.cloudfront.net/files/7e2d9f39cfb72f09182a315c14eb9ac97396f49d/original.jpeg"),
          new LatLong(37.7840735, -122.4092182)),
      new User("4706015", "Cako Creamery - Metreon", "info@cako.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/2e2e7d67f9b2cf05b3173effa1e091aa7e336500/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/atMFWUroRTN_BoyN0-yn59QQArA=/60x60/https://d1g145x70srn7h.cloudfront.net/files/2e2e7d67f9b2cf05b3173effa1e091aa7e336500/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/012hNCEl16aIixHNDgLTKGDAbJA=/200x200/https://d1g145x70srn7h.cloudfront.net/files/2e2e7d67f9b2cf05b3173effa1e091aa7e336500/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/7yw-l0_4m6a0qdTUNiTJhyaBs_w=/400x400/https://d1g145x70srn7h.cloudfront.net/files/2e2e7d67f9b2cf05b3173effa1e091aa7e336500/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/43db6eb111e100209e3d45bd631209dc2dc89395/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/1VF9V65QG2oSysYuAwonhr7niXY=/576x320/https://d1g145x70srn7h.cloudfront.net/files/43db6eb111e100209e3d45bd631209dc2dc89395/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/KcE7YXqLknfienelUPVT8VPEp_c=/286x160/https://d1g145x70srn7h.cloudfront.net/files/43db6eb111e100209e3d45bd631209dc2dc89395/original.jpeg"),
          new LatLong(37.7840561, -122.4036347)),
      new User("451267", "Machine Deli & Coffee", "machinecoffeeanddeli@gmail.com", true,
          new Images(
              "https://d1g145x70srn7h.cloudfront.net/files/33af3cd49ca9942e05701a199d09f626aa887b28/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/tGX63CoNqRwoGWcKTPDuqKRFBkg=/60x60/https://d1g145x70srn7h.cloudfront.net/files/33af3cd49ca9942e05701a199d09f626aa887b28/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/SwxfEjl6NTlAygV4-SozL9lsRw0=/200x200/https://d1g145x70srn7h.cloudfront.net/files/33af3cd49ca9942e05701a199d09f626aa887b28/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/tcz5MDMO7c29WsMh3rYDyXE9rcI=/400x400/https://d1g145x70srn7h.cloudfront.net/files/33af3cd49ca9942e05701a199d09f626aa887b28/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/61a9d1c9d24d1c20eefbcb90ebc1064adb9eeb1b/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/nu5pulEjf4Q-4opytxpW34vn8ZM=/0x203:1632x1110/576x320/https://d1g145x70srn7h.cloudfront.net/files/61a9d1c9d24d1c20eefbcb90ebc1064adb9eeb1b/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/heawM3VMuzw_nds4kwhct2U0XTY=/0x200:1632x1113/286x160/https://d1g145x70srn7h.cloudfront.net/files/61a9d1c9d24d1c20eefbcb90ebc1064adb9eeb1b/original.jpeg"),
          new LatLong(37.7818718, -122.4107602)),
      new User("4475520", "Cako Bakery - Metreon", "metreon@cako.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/ca20ee894ae34764d5570aed8c21182289c3365f/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/MjqH948uObwxZ4SmcPM310kYnJg=/60x60/https://d1g145x70srn7h.cloudfront.net/files/ca20ee894ae34764d5570aed8c21182289c3365f/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/nhjmkCSd0r6JjTVQ7kx5J0wrzdI=/200x200/https://d1g145x70srn7h.cloudfront.net/files/ca20ee894ae34764d5570aed8c21182289c3365f/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/Fm7To7o8H820cqs3IuqoOshKEGM=/400x400/https://d1g145x70srn7h.cloudfront.net/files/ca20ee894ae34764d5570aed8c21182289c3365f/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/ea248696ad3df953b4e7528cca0b88aa9c16f937/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/zfkzs6XoqsgwBk6PPTNHNbON7EM=/576x320/https://d1g145x70srn7h.cloudfront.net/files/ea248696ad3df953b4e7528cca0b88aa9c16f937/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/r-NCWTiunGLeKnz1s_dzel8HGEY=/286x160/https://d1g145x70srn7h.cloudfront.net/files/ea248696ad3df953b4e7528cca0b88aa9c16f937/original.jpeg"),
          new LatLong(37.783783, -122.402962)),
      new User("6512782", "Freshroll Vietnamese", "info@eatatfreshroll.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/c1bc38d71e65a79a7222d1d62d21d56485851c77/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/jzsDLtkb_IGbW_dfqUfsseGFzmo=/60x60/https://d1g145x70srn7h.cloudfront.net/files/c1bc38d71e65a79a7222d1d62d21d56485851c77/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/snQOYP4Cs9-CebFkvjL3XBsaik0=/200x200/https://d1g145x70srn7h.cloudfront.net/files/c1bc38d71e65a79a7222d1d62d21d56485851c77/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/iQT89Ujki7-wS1VJL0H_aEeD_z4=/400x400/https://d1g145x70srn7h.cloudfront.net/files/c1bc38d71e65a79a7222d1d62d21d56485851c77/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/3015852f05d6677ed9c6525a2252c34999be82a3/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/2Qfzl6yMXLDV-5dagE7xVbGURCg=/576x320/https://d1g145x70srn7h.cloudfront.net/files/3015852f05d6677ed9c6525a2252c34999be82a3/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/dsSOudYEJrgb423TWCEROrZEEOM=/286x160/https://d1g145x70srn7h.cloudfront.net/files/3015852f05d6677ed9c6525a2252c34999be82a3/original.jpeg"),
          new LatLong(37.783827, -122.4033763)),
      new User("1218488", "Elite Audio Coffee & Wine", null, true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/bf198967af5a921acd77e8c26137da40a84f7dce/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/yzPpkD_nujkzGJGbdw4vmX3NRL0=/60x60/https://d1g145x70srn7h.cloudfront.net/files/bf198967af5a921acd77e8c26137da40a84f7dce/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/f-751iPoK3oOTzFYhNhlpDsDJCA=/200x200/https://d1g145x70srn7h.cloudfront.net/files/bf198967af5a921acd77e8c26137da40a84f7dce/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/-kIwNvG38kUTqgQ5RrXfUfxPGE0=/400x400/https://d1g145x70srn7h.cloudfront.net/files/bf198967af5a921acd77e8c26137da40a84f7dce/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/644347535613c7b79f14a543ca374b9b22ce6654/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/xao3Ecm2WFM-DCOz9C4_hZz3Wz4=/81x0:5400x2955/576x320/https://d1g145x70srn7h.cloudfront.net/files/644347535613c7b79f14a543ca374b9b22ce6654/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/WRZdPiCh6POFxp6BDofX9YDmhtQ=/99x0:5381x2955/286x160/https://d1g145x70srn7h.cloudfront.net/files/644347535613c7b79f14a543ca374b9b22ce6654/original.jpeg"),
          new LatLong(37.780271, -122.402865)),
      new User("546417", "Huckleberry Bicycles", null, true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/60722749adb5a5b2b821f97ffa212e9b4a762688/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/RDyy3wy9vSc5XHyFzbqrbUpR_do=/60x60/https://d1g145x70srn7h.cloudfront.net/files/60722749adb5a5b2b821f97ffa212e9b4a762688/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/Id6aLAJVEargZVZG2A01gBV4jwQ=/200x200/https://d1g145x70srn7h.cloudfront.net/files/60722749adb5a5b2b821f97ffa212e9b4a762688/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/Is1ornJv6_WSBLSNcNtdTH4Ij_8=/400x400/https://d1g145x70srn7h.cloudfront.net/files/60722749adb5a5b2b821f97ffa212e9b4a762688/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/3ed99fbacfd8f75ab2390af40e220a059d7089bb/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/3LeB1Fq3rj-0YPLqfMb3jZlNJy0=/0x0:1800x1000/576x320/https://d1g145x70srn7h.cloudfront.net/files/3ed99fbacfd8f75ab2390af40e220a059d7089bb/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/gMwQkaxpj8JYXqyHQBwwokeTiKI=/0x0:1800x1007/286x160/https://d1g145x70srn7h.cloudfront.net/files/3ed99fbacfd8f75ab2390af40e220a059d7089bb/original.jpeg"),
          new LatLong(37.7809058, -122.411722)), new User("3729848", "Seasons Lounge", null, true,
      new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/d0d871e723f939fa1143e6fb222807ce8cde625b/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/AvKirQYw6ahEd3BuILORcXe8REg=/60x60/https://d1g145x70srn7h.cloudfront.net/files/d0d871e723f939fa1143e6fb222807ce8cde625b/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/plYJyd6q6-vlH67vg7MGnhsJYh0=/200x200/https://d1g145x70srn7h.cloudfront.net/files/d0d871e723f939fa1143e6fb222807ce8cde625b/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/PCs7BHeaQqE-_l5uR-9NmLo4vO4=/400x400/https://d1g145x70srn7h.cloudfront.net/files/d0d871e723f939fa1143e6fb222807ce8cde625b/original.jpeg"),
      new CuratedImage(
          "https://d1g145x70srn7h.cloudfront.net/files/98c981eb685c205555aed87a19f1a906c4e13391/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/aCAFhv9HA6acQDHtMwn6daNV_B0=/576x320/https://d1g145x70srn7h.cloudfront.net/files/98c981eb685c205555aed87a19f1a906c4e13391/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/2NIhIcmeUQ7yDdXREFM_mlEJ6ds=/286x160/https://d1g145x70srn7h.cloudfront.net/files/98c981eb685c205555aed87a19f1a906c4e13391/original.jpeg"),
      new LatLong(37.787, -122.405)), new User("2569235", "Cask Store", null, true, new Images(
      "https://d1g145x70srn7h.cloudfront.net/files/93173b9fd30e93a3a9bbb64db9c23415e988f2b8/original.jpeg",
      "https://d2isyty7gbnm74.cloudfront.net/-er5QbQ7fFMZlNLPRFi5vHuhFq0=/60x60/https://d1g145x70srn7h.cloudfront.net/files/93173b9fd30e93a3a9bbb64db9c23415e988f2b8/original.jpeg",
      "https://d2isyty7gbnm74.cloudfront.net/zgUJh4hXW1OOyCOmX0ewaXV70p8=/200x200/https://d1g145x70srn7h.cloudfront.net/files/93173b9fd30e93a3a9bbb64db9c23415e988f2b8/original.jpeg",
      "https://d2isyty7gbnm74.cloudfront.net/shK8fkTwcJKVJq5nfL7inPyZsFo=/400x400/https://d1g145x70srn7h.cloudfront.net/files/93173b9fd30e93a3a9bbb64db9c23415e988f2b8/original.jpeg"),
      new CuratedImage(
          "https://d1g145x70srn7h.cloudfront.net/files/404e2ea350f70af690738f11cc6b4134011e8edd/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/9XrkaFZr0YYp5oWvATzL2aLxy5E=/576x320/https://d1g145x70srn7h.cloudfront.net/files/404e2ea350f70af690738f11cc6b4134011e8edd/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/yYBDwk_GmInzIofR3W1-89BEyLQ=/286x160/https://d1g145x70srn7h.cloudfront.net/files/404e2ea350f70af690738f11cc6b4134011e8edd/original.jpeg"),
      new LatLong(37.7872667, -122.4031893)),
      new User("3", "Sightglass Coffee", "hello@sightglasscoffee.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/7e7eb576bef33e9c2825c0d927f9ded1b6871ba6/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/XPBcviclClva5K6OtEsmFtbDGeA=/60x60/https://d1g145x70srn7h.cloudfront.net/files/7e7eb576bef33e9c2825c0d927f9ded1b6871ba6/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/vgWNWbAmfH0IKg_sl5-UZQaQSDI=/200x200/https://d1g145x70srn7h.cloudfront.net/files/7e7eb576bef33e9c2825c0d927f9ded1b6871ba6/original.png",
          "https://d2isyty7gbnm74.cloudfront.net/kQBNk0fKWE5oLfjyp4qUgdiyZLg=/400x400/https://d1g145x70srn7h.cloudfront.net/files/7e7eb576bef33e9c2825c0d927f9ded1b6871ba6/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/94ea0c66ca3780c3ecd18ee6d375f7d933cbd21f/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/bL7JG1SMfzBgBdqgoZS1e2TsbMk=/576x320/https://d1g145x70srn7h.cloudfront.net/files/94ea0c66ca3780c3ecd18ee6d375f7d933cbd21f/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/6dq_5gqLPy7z032vnM519AwjHTM=/286x160/https://d1g145x70srn7h.cloudfront.net/files/94ea0c66ca3780c3ecd18ee6d375f7d933cbd21f/original.png"),
          new LatLong(37.7771064, -122.4084745)),
      new User("1778228", "Del Taco 750", "deltacosf@gmail.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/5a4a798ec23d372735ba6a0622d71bfb3653f348/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/G701CgXQYaJWS88w2V4k3qjki6k=/60x60/https://d1g145x70srn7h.cloudfront.net/files/5a4a798ec23d372735ba6a0622d71bfb3653f348/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/TOMlZHgT1qkt5JERQ2-hoqhPgqk=/200x200/https://d1g145x70srn7h.cloudfront.net/files/5a4a798ec23d372735ba6a0622d71bfb3653f348/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/oe1L6qKQ6TIYs4btFgMMM10uhFw=/400x400/https://d1g145x70srn7h.cloudfront.net/files/5a4a798ec23d372735ba6a0622d71bfb3653f348/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/c32a06475342d64887ed8c8a18c5a00d36e5ddaa/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/pEF9HeU5tvCKmk0afyPFL9mZRDc=/576x320/https://d1g145x70srn7h.cloudfront.net/files/c32a06475342d64887ed8c8a18c5a00d36e5ddaa/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/UC3pJnTpzywvk4dPXmt2S1TOv4Q=/286x160/https://d1g145x70srn7h.cloudfront.net/files/c32a06475342d64887ed8c8a18c5a00d36e5ddaa/original.jpeg"),
          new LatLong(37.7871335, -122.4038166)),
      new User("1233108", "Young Ellis Produce", null, true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/c6c86a97cfa4681f537626d054649f5c6027bd96/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/-neiPz73DXSfZz8KI9bu_WDMYAg=/60x60/https://d1g145x70srn7h.cloudfront.net/files/c6c86a97cfa4681f537626d054649f5c6027bd96/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/mS0fChEFlfGu88dLwzkSVt5XX1E=/200x200/https://d1g145x70srn7h.cloudfront.net/files/c6c86a97cfa4681f537626d054649f5c6027bd96/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/hcG4ZYVRKUpYHmkwc5m9cUI1e7c=/400x400/https://d1g145x70srn7h.cloudfront.net/files/c6c86a97cfa4681f537626d054649f5c6027bd96/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/cc996a8870fc6920967029533cdce627f14c3840/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/1sbzkp4B9uzlYVxC9FVmI9Wt-h4=/576x320/https://d1g145x70srn7h.cloudfront.net/files/cc996a8870fc6920967029533cdce627f14c3840/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/Fe2ydehSK0mj5UvFsVOHA2fZz9Y=/286x160/https://d1g145x70srn7h.cloudfront.net/files/cc996a8870fc6920967029533cdce627f14c3840/original.jpeg"),
          new LatLong(37.7849067, -122.4127405)),
      new User("6341899", "Top Bar @ Sightglass Coffee", "info@sightglasscoffee.com", true,
          new Images(
              "https://d1g145x70srn7h.cloudfront.net/files/127daa5ba3c9f20bee5bd5aa760676bd30d157b5/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/URmDonkuH_axcChLECEomlfeIZU=/60x60/https://d1g145x70srn7h.cloudfront.net/files/127daa5ba3c9f20bee5bd5aa760676bd30d157b5/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/H3wv-6XIhb5JjRt5YkeCiG9O0Og=/200x200/https://d1g145x70srn7h.cloudfront.net/files/127daa5ba3c9f20bee5bd5aa760676bd30d157b5/original.png",
              "https://d2isyty7gbnm74.cloudfront.net/xpljXHxSlt9iZ7zxpiAMdBNKmNs=/400x400/https://d1g145x70srn7h.cloudfront.net/files/127daa5ba3c9f20bee5bd5aa760676bd30d157b5/original.png"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/108069e425705fc19d246058c4763b27b1e1a303/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/z9C60noJ4fliqXAucwl09MpDKdo=/576x320/https://d1g145x70srn7h.cloudfront.net/files/108069e425705fc19d246058c4763b27b1e1a303/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/KhOO1Py_s9aJWn4DKhD1yhAcxfU=/286x160/https://d1g145x70srn7h.cloudfront.net/files/108069e425705fc19d246058c4763b27b1e1a303/original.jpeg"),
          new LatLong(37.7771312279, -122.4085958178)),
      new User("5006711", "Otis Cafe Kiosk", "andywasserman@me.com", true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/123dc2ac41a20398636ed912c8aec1decd9e18af/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/itMYBTh0fS_LnnsP6ddSuepL9Fo=/60x60/https://d1g145x70srn7h.cloudfront.net/files/123dc2ac41a20398636ed912c8aec1decd9e18af/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/RmyCL-vaZs0bqa3o6_Ov4V2EXr4=/200x200/https://d1g145x70srn7h.cloudfront.net/files/123dc2ac41a20398636ed912c8aec1decd9e18af/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/b17UxxfM_NS4UI2EUv7NwpU9Zys=/400x400/https://d1g145x70srn7h.cloudfront.net/files/123dc2ac41a20398636ed912c8aec1decd9e18af/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/2a88a24823cdc068165143287195989d2a5cc5da/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/FXN2EsCnVgfaepbUDeBvhYf0qVc=/576x320/https://d1g145x70srn7h.cloudfront.net/files/2a88a24823cdc068165143287195989d2a5cc5da/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/up7Znu3LQ-rK5_z18U2L1n_JxaI=/286x160/https://d1g145x70srn7h.cloudfront.net/files/2a88a24823cdc068165143287195989d2a5cc5da/original.jpeg"),
          new LatLong(37.7882654, -122.403575)),
      new User("2918294", "Celtic Coffee Company", null, true, new Images(
          "https://d1g145x70srn7h.cloudfront.net/files/b6ffb9b36af73942799eebdf2f0b76b9d2e7ffe6/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/Zg2lqj2doLjpxRe0dsYhQzC6rbE=/60x60/https://d1g145x70srn7h.cloudfront.net/files/b6ffb9b36af73942799eebdf2f0b76b9d2e7ffe6/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/fVbPYBFE1iWrqIf7aiKmv-qwa-s=/200x200/https://d1g145x70srn7h.cloudfront.net/files/b6ffb9b36af73942799eebdf2f0b76b9d2e7ffe6/original.jpeg",
          "https://d2isyty7gbnm74.cloudfront.net/yqa9hCp-q5bS0vwyfYgilEa2VfQ=/400x400/https://d1g145x70srn7h.cloudfront.net/files/b6ffb9b36af73942799eebdf2f0b76b9d2e7ffe6/original.jpeg"),
          new CuratedImage(
              "https://d1g145x70srn7h.cloudfront.net/files/f60d48c4d69e830b592622f95f37b69ec769a498/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/batP5lqRlyWcHs-1-3qd3OsWpj4=/576x320/https://d1g145x70srn7h.cloudfront.net/files/f60d48c4d69e830b592622f95f37b69ec769a498/original.jpeg",
              "https://d2isyty7gbnm74.cloudfront.net/rHvRLXFclpbjy57tgtjOxPSQk4Y=/286x160/https://d1g145x70srn7h.cloudfront.net/files/f60d48c4d69e830b592622f95f37b69ec769a498/original.jpeg"),
          new LatLong(37.780842, -122.4146008)),
  };
}
