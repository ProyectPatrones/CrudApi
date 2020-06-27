package pe.edu.upc.democrud.services;

import pe.edu.upc.democrud.models.News;

public interface INewsService extends ICrudService<News> {
    public String ShowRelatedNew();
}
