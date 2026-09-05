package net.mreskimo.gam.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mreskimo.gam.GAM;

public class GAMItemModelProvider extends ItemModelProvider {
    public GAMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GAM.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GAM.MOD_ID, "item/" + item.getId().getPath()));

    }
}
